package com.mkpits.games;

import java.util.Scanner;
import java.util.Random;

public class HangmanGame {

    private static final String[] WORDS = {"java", "python", "programming", "hangman", "computer", "coding"};
    private static final int MAX_ATTEMPTS = 6;

    private String selectedWord;
    private StringBuilder currentWordState;
    private int remainingAttempts;

    public HangmanGame() {
        Random random = new Random();
        selectedWord = WORDS[random.nextInt(WORDS.length)];
        currentWordState = new StringBuilder("_".repeat(selectedWord.length()));
        remainingAttempts = MAX_ATTEMPTS;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (remainingAttempts > 0 && currentWordState.indexOf("_") != -1) {
            System.out.println("Current word: " + currentWordState);
            System.out.println("Attempts left: " + remainingAttempts);
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            if (!makeGuess(guess)) {
                remainingAttempts--;
                System.out.println("Incorrect guess. Try again!");
            } else {
                System.out.println("Correct guess!");
            }
        }

        scanner.close();

        if (currentWordState.indexOf("_") == -1) {
            System.out.println("Congratulations! You guessed the word: " + selectedWord);
        } else {
            System.out.println("Out of attempts! The word was: " + selectedWord);
        }
    }

    private boolean makeGuess(char guess) {
        boolean correctGuess = false;

        for (int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == guess) {
                currentWordState.setCharAt(i, guess);
                correctGuess = true;
            }
        }

        return correctGuess;
    }

    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        System.out.println("Welcome to Hangman!");
        hangmanGame.play();
    }
}

