package com.mkpits.games;

import java.util.Scanner;

public class BallStrikesGame {

    private static final int BOARD_SIZE = 10;
    private static final char EMPTY_CELL = '.';
    private static final char BALL_CELL = 'O';

    private int ballPosition;
    private int ballDirection; // 0: Up, 1: Right, 2: Down, 3: Left

    public BallStrikesGame() {
        ballPosition = BOARD_SIZE / 2;
        ballDirection = 1; // Initial direction is right
    }

    private void moveBall() {
        switch (ballDirection) {
            case 0: // Up
                ballPosition--;
                break;
            case 1: // Right
                ballPosition++;
                break;
            case 2: // Down
                ballPosition++;
                break;
            case 3: // Left
                ballPosition--;
                break;
        }

        // Check and handle collisions with walls
        if (ballPosition == 0 && ballDirection == 0) {
            ballDirection = 2; // Change direction to Down when hitting the top wall
        } else if (ballPosition == BOARD_SIZE - 1 && ballDirection == 2) {
            ballDirection = 0; // Change direction to Up when hitting the bottom wall
        }
    }

    private void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (i == ballPosition) {
                System.out.print(BALL_CELL + " ");
            } else {
                System.out.print(EMPTY_CELL + " ");
            }
        }
        System.out.println();
    }

    private void handleInput(char input) {
        switch (input) {
            case 'w':
                ballDirection = 0; // Up
                break;
            case 'd':
                ballDirection = 1; // Right
                break;
            case 's':
                ballDirection = 2; // Down
                break;
            case 'a':
                ballDirection = 3; // Left
                break;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.print("Enter direction (w/a/s/d): ");
            char input = scanner.next().charAt(0);
            handleInput(input);
            moveBall();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BallStrikesGame ballStrikesGame = new BallStrikesGame();
        ballStrikesGame.run();
    }
}

