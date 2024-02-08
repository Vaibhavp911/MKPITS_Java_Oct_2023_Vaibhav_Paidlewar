package com.mkpits.games;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame {

    private static final int BOARD_SIZE = 10;
    private static final char EMPTY_CELL = '.';
    private static final char SNAKE_BODY = 'O';
    private static final char FOOD_CELL = '*';

    private static final int INITIAL_LENGTH = 3;

    private char[][] board;
    private Queue<Point> snake;
    private Point food;
    private int direction; // 0: Up, 1: Right, 2: Down, 3: Left
    private boolean gameOver;

    public SnakeGame() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        snake = new LinkedList<>();
        direction = 1; // Initial direction is right
        gameOver = false;

        initializeBoard();
        initializeSnake();
        placeFood();
    }

    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }
    }

    private void initializeSnake() {
        int x = BOARD_SIZE / 2;
        int y = BOARD_SIZE / 2;
        for (int i = 0; i < INITIAL_LENGTH; i++) {
            snake.offer(new Point(x - i, y));
        }
    }

    private void placeFood() {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(BOARD_SIZE);
            y = random.nextInt(BOARD_SIZE);
        } while (board[x][y] != EMPTY_CELL);
        food = new Point(x, y);
        board[x][y] = FOOD_CELL;
    }

    private void move() {
        Point head = snake.peek();
        Point newHead = getNextHead(head);

        if (newHead.equals(food)) {
            snake.offer(newHead);
            placeFood();
        } else {
            Point tail = snake.poll();
            board[tail.x][tail.y] = EMPTY_CELL;

            if (board[newHead.x][newHead.y] == SNAKE_BODY) {
                gameOver = true;
                return;
            }

            snake.offer(newHead);
        }

        board[newHead.x][newHead.y] = SNAKE_BODY;
    }

    private Point getNextHead(Point currentHead) {
        int x = currentHead.x;
        int y = currentHead.y;

        switch (direction) {
            case 0: // Up
                x--;
                break;
            case 1: // Right
                y++;
                break;
            case 2: // Down
                x++;
                break;
            case 3: // Left
                y--;
                break;
        }

        return new Point(x, y);
    }

    private void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void handleInput(char input) {
        switch (input) {
            case 'w':
                if (direction != 2) {
                    direction = 0;
                }
                break;
            case 'd':
                if (direction != 3) {
                    direction = 1;
                }
                break;
            case 's':
                if (direction != 0) {
                    direction = 2;
                }
                break;
            case 'a':
                if (direction != 1) {
                    direction = 3;
                }
                break;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            printBoard();
            System.out.print("Enter direction (w/a/s/d): ");
            char input = scanner.next().charAt(0);
            handleInput(input);
            move();
            System.out.println();
        }
        System.out.println("Game Over!");
        scanner.close();
    }

    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame();
        snakeGame.run();
    }

    private static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
