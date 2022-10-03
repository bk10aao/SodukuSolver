import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SodukuSolverTest {

    @Test
    public void simpleTest() {
        assertEquals(1,1);
    }

    @Test
    public void givenSolvableInput_returns_true() {
        assertTrue(SudokuSolver.solveBoard(solvableBoard));
        SudokuSolver.printBoard(solvableBoard);
    }

    @Test
    public void givenUnsSolvableInput_returns_false() {
        assertFalse(SudokuSolver.solveBoard(unsolvableBoard));
    }

    private static final int[][] solvableBoard =  { {7, 0, 2, 0, 5, 0, 6, 0, 0},
                                                    {0, 0, 0, 0, 0, 3, 0, 0, 0},
                                                    {1, 0, 0, 0, 0, 9, 5, 0, 0},
                                                    {8, 0, 0, 0, 0, 0, 0, 9, 0},
                                                    {0, 4, 3, 0, 0, 0, 7, 5, 0},
                                                    {0, 9, 0, 0, 0, 0, 0, 0, 8},
                                                    {0, 0, 9, 7, 0, 0, 0, 0, 5},
                                                    {0, 0, 0, 2, 0, 0, 0, 0, 0},
                                                    {0, 0, 7, 0, 4, 0, 2, 0, 3} };

    private static final int[][] unsolvableBoard =    { {7, 7, 2, 0, 5, 0, 6, 0, 0},
                                                        {0, 0, 0, 0, 0, 3, 0, 0, 0},
                                                        {1, 0, 0, 0, 0, 9, 5, 0, 0},
                                                        {8, 0, 0, 0, 0, 0, 0, 9, 0},
                                                        {0, 4, 3, 0, 0, 0, 7, 5, 0},
                                                        {0, 9, 0, 0, 0, 0, 0, 0, 8},
                                                        {0, 0, 9, 7, 0, 0, 0, 0, 5},
                                                        {0, 0, 0, 2, 0, 0, 0, 0, 0},
                                                        {0, 0, 7, 0, 4, 0, 2, 0, 3} };
}