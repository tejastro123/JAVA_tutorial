class Sudoku {

    // Check if placing the number is safe
    public boolean isSafe(char[][] board, int row, int col, int number) {
        char numChar = (char) (number + '0');

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == numChar) return false;
        }

        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == numChar) return false;
        }

        // Check 3x3 grid
        int startRow = 3 * (row / 3);
        int startCol = 3 * (col / 3);

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == numChar) return false;
            }
        }

        return true;
    }

    // Recursive backtracking function
    public boolean solve(char[][] board, int row, int col) {
        // If reached end of board
        if (row == 9) return true;

        // Move to next cell
        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col + 1) % 9;

        // Skip already filled cells
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }

        // Try placing 1-9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = (char) (num + '0');

                if (solve(board, nextRow, nextCol)) return true;

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false; // No valid number found
    }

    // Public API
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    // Main function to test
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Sudoku solver = new Sudoku();
        solver.solveSudoku(board);

        System.out.println("Solved Sudoku:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
