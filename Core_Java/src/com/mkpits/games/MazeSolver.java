package com.mkpits.games;

public class MazeSolver {

    public static void main(String[] args) {
        int[][] maze = {
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 1, 1, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 1},
            {0, 0, 0, 0, 0, 0}
        };

        System.out.println("Maze:");
        printMaze(maze);

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        boolean pathFound = solveMaze(maze, visited, 0, 0);

        if (pathFound) {
            System.out.println("Solution found:");
            printMaze(maze);
        } else {
            System.out.println("No solution found.");
        }
    }

    private static boolean solveMaze(int[][] maze, boolean[][] visited, int row, int col) {
        int numRows = maze.length;
        int numCols = maze[0].length;

        if (row < 0 || col < 0 || row >= numRows || col >= numCols || maze[row][col] == 1 || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        if (row == numRows - 1 && col == numCols - 1) {
            // Reached the exit
            return true;
        }

        // Explore neighbors in a depth-first manner
        if (solveMaze(maze, visited, row + 1, col) ||
            solveMaze(maze, visited, row - 1, col) ||
            solveMaze(maze, visited, row, col + 1) ||
            solveMaze(maze, visited, row, col - 1)) {
            return true;
        }

        // Backtrack if no path is found
        visited[row][col] = false;
        return false;
    }

    private static void printMaze(int[][] maze) {
        for (int[] row : maze) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

