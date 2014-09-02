import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TorusSailingEasyTest {

    protected TorusSailingEasy solution;

    @Before
    public void setUp() {
        solution = new TorusSailingEasy();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 2;
        int M = 2;
        int goalX = 1;
        int goalY = 1;

        double expected = 1.0;
        double actual = solution.expectedTime(N, M, goalX, goalY);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 2;
        int M = 2;
        int goalX = 0;
        int goalY = 1;

        double expected = -1.0;
        double actual = solution.expectedTime(N, M, goalX, goalY);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 3;
        int M = 3;
        int goalX = 1;
        int goalY = 1;

        double expected = 2.0;
        double actual = solution.expectedTime(N, M, goalX, goalY);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 4;
        int M = 6;
        int goalX = 1;
        int goalY = 3;

        double expected = 27.0;
        double actual = solution.expectedTime(N, M, goalX, goalY);

        assertEquals(expected, actual);
    }

}
