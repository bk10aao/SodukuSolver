import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class SodukuSolverTest {

    @Test
    public void givenSolvableInput_returns_true() {
        SudokuSolver sudokuSolver = new SudokuSolver(solvableBoard);
        assertTrue(sudokuSolver.solveBoard(solvableBoard));
        SudokuSolver.printBoard(solvableBoard);
    }

    @Test
    public void givenSolvableInput_returns_matching_String() {
        SudokuSolver sudokuSolver = new SudokuSolver(solvableBoard);
        assertTrue(sudokuSolver.solveBoard(solvableBoard));
        String result = SudokuSolver.printBoard(solvableBoard);
        assertEquals(expectedPrint, result);
    }

    @Test
    public void givenUnsolvableInput_returns_false() {
        SudokuSolver sudokuSolver = new SudokuSolver(unsolvableBoard);
        assertFalse(sudokuSolver.solveBoard(unsolvableBoard));
    }

    private static final int[][] solvableBoard =      { {7, 0, 2, 0, 5, 0, 6, 0, 0},
                                                        {0, 0, 0, 0, 0, 3, 0, 0, 0},
                                                        {1, 0, 0, 0, 0, 9, 5, 0, 0},
                                                        {8, 0, 0, 0, 0, 0, 0, 9, 0},
                                                        {0, 4, 3, 0, 0, 0, 7, 5, 0},
                                                        {0, 9, 0, 0, 0, 0, 0, 0, 8},
                                                        {0, 0, 9, 7, 0, 0, 0, 0, 5},
                                                        {0, 0, 0, 2, 0, 0, 0, 0, 0},
                                                        {0, 0, 7, 0, 4, 0, 2, 0, 3}
    };

    private static final int[][] unsolvableBoard =    { {7, 7, 2, 0, 5, 0, 6, 0, 0},
                                                        {0, 0, 0, 0, 0, 3, 0, 0, 0},
                                                        {1, 0, 0, 0, 0, 9, 5, 0, 0},
                                                        {8, 0, 0, 0, 0, 0, 0, 9, 0},
                                                        {0, 4, 3, 0, 0, 0, 7, 5, 0},
                                                        {0, 9, 0, 0, 0, 0, 0, 0, 8},
                                                        {0, 0, 9, 7, 0, 0, 0, 0, 5},
                                                        {0, 0, 0, 2, 0, 0, 0, 0, 0},
                                                        {0, 0, 7, 0, 4, 0, 2, 0, 3} };

    private static final String expectedPrint =         "732 | 458 | 619\n" +
                                                        "956 | 173 | 824\n" +
                                                        "184 | 629 | 537\n" +
                                                        "--- + --- +---\n" +
                                                        "871 | 564 | 392\n" +
                                                        "643 | 892 | 751\n" +
                                                        "295 | 317 | 468\n" +
                                                        "--- + --- +---\n" +
                                                        "329 | 786 | 145\n" +
                                                        "418 | 235 | 976\n" +
                                                        "567 | 941 | 283\n";
}