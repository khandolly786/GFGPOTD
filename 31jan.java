class Solution {
    static final int SIZE = 9; 

    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        boolean[][] rowCheck = new boolean[SIZE][SIZE + 1];
        boolean[][] colCheck = new boolean[SIZE][SIZE + 1];
        boolean[][] boxCheck = new boolean[SIZE][SIZE + 1];

        // Pre-fill tracking arrays
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (mat[i][j] != 0) {
                    int num = mat[i][j];
                    rowCheck[i][num] = true;
                    colCheck[j][num] = true;
                    boxCheck[(i / 3) * 3 + j / 3][num] = true;
                }
            }
        }

        solve(mat, rowCheck, colCheck, boxCheck, 0, 0);
    }

    // Optimized backtracking function
    static boolean solve(int[][] mat, boolean[][] rowCheck, boolean[][] colCheck, boolean[][] boxCheck, int row, int col) {
        if (row == SIZE) return true; // If we reach the last row, Sudoku is solved
        
        if (col == SIZE) return solve(mat, rowCheck, colCheck, boxCheck, row + 1, 0); // Move to next row

        if (mat[row][col] != 0) return solve(mat, rowCheck, colCheck, boxCheck, row, col + 1); // Skip filled cells

        int boxIndex = (row / 3) * 3 + col / 3;
        for (int num = 1; num <= SIZE; num++) {
            if (!rowCheck[row][num] && !colCheck[col][num] && !boxCheck[boxIndex][num]) {
                mat[row][col] = num;
                rowCheck[row][num] = colCheck[col][num] = boxCheck[boxIndex][num] = true;

                if (solve(mat, rowCheck, colCheck, boxCheck, row, col + 1)) {
                    return true;
                }

                // Backtracking step
                mat[row][col] = 0;
                rowCheck[row][num] = colCheck[col][num] = boxCheck[boxIndex][num] = false;
            }
        }
        return false;
    }
}
