class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
          ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> board = new ArrayList<>();
        solveNQueens(n, 0, board, result);
        return result;
    }

    private void solveNQueens(int n, int col, ArrayList<Integer> board, ArrayList<ArrayList<Integer>> result) {
        if (col == n) {
            result.add(new ArrayList<>(board)); // Add valid board configuration
            return;
        }

        for (int row = 1; row <= n; row++) {
            if (isSafe(board, col, row)) {
                board.add(row);
                solveNQueens(n, col + 1, board, result);
                board.remove(board.size() - 1); // Backtrack
            }
        }
    }

    private boolean isSafe(ArrayList<Integer> board, int col, int row) {
        for (int prevCol = 0; prevCol < col; prevCol++) {
            int prevRow = board.get(prevCol);
            if (prevRow == row || Math.abs(prevRow - row) == Math.abs(prevCol - col)) {
                return false; // Same row or same diagonal
            }
        }
        return true;
    }
}
