package edu.apcs.finalProject;

public class Main {
    public static void main(String[] args) {
        // create a new sudoku board to be sovled
        int[][] board = {
                { 0,7,0,0,0,6,0,0,2 },
                { 0,0,0,8,0,0,0,0,0 },
                { 6,2,0,1,0,0,3,0,0 },
                { 0,9,0,0,0,0,0,1,0 },
                { 7,0,4,0,0,0,5,0,8 },
                { 0,5,0,0,0,0,0,2,0 },
                { 0,0,6,0,0,8,0,3,5 },
                { 0,0,0,0,0,7,0,0,0 },
                { 2,0,0,4,0,0,0,8,0 }
        };
        SudokuSolver solver = new SudokuSolver(board);
        int[][] solution = solver.solve();
        if (solution != null) {
            System.out.println("Solution found!");
            // print board with spacers ex. | and -
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(solution[i][j] + " ");
                    if (j == 2 || j == 5) {
                        System.out.print("| ");
                    }
                }
                System.out.println();
                if (i % 3 == 2 && i != 8) {
                    System.out.println("---------------------");
                }
            }
        } else {
            System.out.println("No solution found!");
        }
    }
}