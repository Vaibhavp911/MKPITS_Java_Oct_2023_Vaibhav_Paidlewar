package com.mkpits.games;

import java.util.Scanner;

public class ConnectFourGame {

    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private static char[][] board = new char[ROWS][COLUMNS];
    private static char currentPlayer = 'X';


    public static void main(String[] args) {
        initializeBoard();

        Scanner scanner = new Scanner(System.in);

        boolean gameWon = false;
        boolean isBoardFull = false;

        while (!gameWon && !isBoardFull) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (column 1-7): ");
            int column = scanner.nextInt() - 1;

            if (isValidMove(column)) {
                makeMove(column);

                gameWon = checkWin();
                isBoardFull = isBoardFull();
                if (!gameWon) {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        printBoard();

        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw! The board is full.");
            }

            scanner.close();
        }

        private static void initializeBoard() {
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLUMNS; j++) {
                    board[i][j] = ' ';
                }
            }
        }

        private static void printBoard() {
            System.out.println(" 1 2 3 4 5 6 7");
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLUMNS; j++) {
                    System.out.print("|" + board[i][j]);
                }
                System.out.println("|");
            }
            System.out.println("---------------");
        }

        private static boolean isValidMove(int column) {
            return column >= 0 && column < COLUMNS && board[0][column] == ' ';
        }

        private static void makeMove(int column) {
            for (int i = ROWS - 1; i >= 0; i--) {
                if (board[i][column] == ' ') {
                    board[i][column] = currentPlayer;
                    break;
                }
            }
        }

        private static void switchPlayer() {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        private static boolean checkWin() {
            return checkRows() || checkColumns() || checkDiagonals();
        }

        private static boolean checkRows() {
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j <= COLUMNS - 4; j++) {
                    if (board[i][j] != ' ' &&
                            board[i][j] == board[i][j + 1] &&
                            board[i][j] == board[i][j + 2] &&
                            board[i][j] == board[i][j + 3]) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static boolean checkColumns() {
            for (int i = 0; i <= ROWS - 4; i++) {
                for (int j = 0; j < COLUMNS; j++) {
                    if (board[i][j] != ' ' &&
                            board[i][j] == board[i + 1][j] &&
                            board[i][j] == board[i + 2][j] &&
                            board[i][j] == board[i + 3][j]) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static boolean checkDiagonals() {
            for (int i = 0; i <= ROWS - 4; i++) {
                for (int j = 0; j <= COLUMNS - 4; j++) {
                    if (board[i][j] != ' ' &&
                            board[i][j] == board[i + 1][j + 1] &&
                            board[i][j] == board[i + 2][j + 2] &&
                            board[i][j] == board[i + 3][j + 3]) {
                        return true;
                    }

                    if (board[i + 3][j] != ' ' &&
                            board[i + 3][j] == board[i + 2][j + 1] &&
                            board[i + 3][j] == board[i + 1][j + 2] &&
                            board[i + 3][j] == board[i][j + 3]) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static boolean isBoardFull() {
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLUMNS; j++) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
    }


