package Week1Challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Week1SolutionTesting {

    private Week1Solution week1SolutionTest;

    @BeforeEach
    public void init() {
        week1SolutionTest = new Week1Solution();
    }

    @Test
    public void testAscendingSuccess1() {
        String testString = "232425";
        assertTrue(week1SolutionTest.ascending(testString));
    }

    @Test
    public void testAscendingSuccess2() {
        String testString = "444445";
        assertTrue(week1SolutionTest.ascending(testString));
    }

    @Test
    public void testAscendingFailBadNum() {
        String testString = "2324256";
        assertFalse(week1SolutionTest.ascending(testString));
    }

    @Test
    public void testAscendingFailBadString() {
        String testString = "abc";
        assertFalse(week1SolutionTest.ascending(testString));
    }

    @Test
    public void testSquarePatch() {
        int[][] correctArray = {{3, 3, 3},
                                {3, 3, 3},
                                {3, 3, 3,}};
        int[][] testArray = week1SolutionTest.squarePatch(3);
        assertTrue(Arrays.deepEquals(correctArray, testArray));
    }
}
