package com.mkpits.games;

import java.util.Random;
import java.util.Scanner;

public class BreakoutGame {

    private static final int WIDTH = 10;
    private static final int HEIGHT = 5;
    private static final char PADDLE = '-';
    private static final char BALL = 'O';
    private static final char BRICK = '#';
    private static final char EMPTY = ' ';

    private char[][] board;
    private int paddlePosition;
    private int ballRow, ballCol;
    private int ballDirectionRow, ballDirectionCol;

    public BreakoutGame() {
        board = new char[HEIGHT][WIDTH];
        initializeBoard();
        initializeBall();
        paddlePosition = WIDTH / 2;
    }

    private void initializeBoard() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                board[i][j] = EMPTY;
            }
        }
        placeBricks();
    }

    private void placeBricks() {
        Random random = new Random();
        for (int i = 0; i < HEIGHT / 2; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (random.nextBoolean()) {
                    board[i][j] = BRICK;
                }
            }
        }
    }

    private void initializeBall() {
        Random random = new Random();
        ballRow = HEIGHT - 1;
        ballCol = random.nextInt(WIDTH);
        ballDirectionRow = -1;
        ballDirectionCol = random.nextBoolean() ? 1 : -1;
    }

    private void movePaddle(int direction) {
        paddlePosition += direction;
        if (paddlePosition < 0) {
            paddlePosition = 0;
        } else if (paddlePosition >= WIDTH) {
            paddlePosition = WIDTH - 1;
        }
    }

    private void moveBall() {
        ballRow += ballDirectionRow;
        ballCol += ballDirectionCol;

        // Check for collisions with walls and paddle
        if (ballRow == -1) {
            // Ball hits the top, change direction
            ballDirectionRow = -ballDirectionRow;
        } else if (ballRow == HEIGHT - 1) {
            // Ball hits the bottom, reset ball position
            initializeBall();
        } else if (board[ballRow][ballCol] == BRICK) {
            // Ball hits a brick, remove the brick
            board[ballRow][ballCol] = EMPTY;
            // Change ball direction
            ballDirectionRow = -ballDirectionRow;
        } else if (ballCol == 0 || ballCol == WIDTH - 1) {
            // Ball hits the side walls, change direction
            ballDirectionCol = -ballDirectionCol;
        } else if (ballRow == HEIGHT - 2 && ballCol >= paddlePosition && ballCol < paddlePosition + 3) {
            // Ball hits the paddle, change direction
            ballDirectionRow = -ballDirectionRow;
        }
    }

    private void printBoard() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == HEIGHT - 1 && j >= paddlePosition && j < paddlePosition + 3) {
                    System.out.print(PADDLE);
                } else if (i == ballRow && j == ballCol) {
                    System.out.print(BALL);
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BreakoutGame game = new BreakoutGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Breakout!");
        System.out.println("Use 'A' and 'D' to move the paddle. Press 'Q' to quit.");

        while (true) {
            game.moveBall();
            game.printBoard();

            System.out.print("Move paddle (A/D): ");
            char input = scanner.next().toUpperCase().charAt(0);

            if (input == 'A') {
                game.movePaddle(-1);
            } else if (input == 'D') {
                game.movePaddle(1);
            } else if (input == 'Q') {
                System.out.println("Game over. Thanks for playing!");
                break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
