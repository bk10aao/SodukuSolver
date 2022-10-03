public class SudokuSolver {

    private static final int GRID_SIZE = 9;
    static int[][] gridData =   { {0, 0, 0, 0, 2, 8, 0, 7, 0},
            {0, 0, 0, 3, 0, 0, 0, 0, 8},
            {0, 0, 8, 0, 0, 1, 0, 0, 4},
            {0, 4, 0, 0, 0, 0, 7, 0, 6},
            {0, 8, 0, 7, 5, 6, 0, 4, 0},
            {5, 0, 7, 0, 0, 0, 0, 1, 0},
            {9, 0, 0, 8, 0, 0, 6, 0, 0},
            {8, 0, 0, 0, 0, 9, 0, 0, 0},
            {0, 2, 0, 5, 4, 0, 0, 0, 0} };
    private static int[][] grid;

    public SudokuSolver(int[][] grid) {
        this.grid = grid;
    }
    public static void main(String[] args) {
        SudokuSolver sudokuSolver = new SudokuSolver(gridData);
        System.out.println(printBoard(grid));
        if(sudokuSolver.solveBoard(grid))
            System.out.println("\nSolved Successfully\n");
        else
            System.out.println("\nUnsolvable grid\n");
        System.out.println(printBoard(grid));
    }

    public static String printBoard(int[][] board) {
        StringBuilder s = new StringBuilder();
        for(int row = 0; row < GRID_SIZE; row++) {
            if(row % 3 == 0 && row != 0)
                s.append("--- + --- +---\n");
            for(int column = 0; column < GRID_SIZE; column++) {
                if(column % 3 == 0 && column != 0)
                    s.append(" | ");
                s.append(board[row][column]);
            }
            s.append("\n");
        }
        return s.toString();
    }

    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++)
            if(board[row][i] == number)
                return true;
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++)
            if(board[i][column] == number)
                return true;
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxRow = row -row % 3;
        int localBoxColumn = column - column % 3;

        for(int i = localBoxRow ; i < localBoxRow + 3; i++)
            for(int j = localBoxColumn; j < localBoxColumn + 3; j++)
                if(board[i][j] == number)
                    return true;
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row) &&
               !isNumberInColumn(board, number, column) &&
               !isNumberInBox(board, number, row, column);
    }

    public boolean solveBoard(int[][] board) {
        for(int row = 0; row < GRID_SIZE; row++)
            for(int column = 0; column < GRID_SIZE; column++)
                if(board[row][column] == 0)
                    return solveSquare(board, row, column);
        return true;
    }

    private boolean solveSquare(int[][] board, int row, int column) {
        for(int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++)
            if(isValidPlacement(board, numberToTry, row, column)) {
                board[row][column] = numberToTry;
                if (solveBoard(board))
                    return true;
                else
                    board[row][column] = 0;
            }
        return false;
    }
}