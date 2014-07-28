import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxPlayingGameTest {

    protected FoxPlayingGame solution;

    @Before
    public void setUp() {
        solution = new FoxPlayingGame();
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
        int nA = 5;
        int nB = 4;
        int paramA = 3000;
        int paramB = 2000;

        double expected = 240.0;
        double actual = solution.theMax(nA, nB, paramA, paramB);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int nA = 3;
        int nB = 3;
        int paramA = 2000;
        int paramB = 100;

        double expected = 6.0;
        double actual = solution.theMax(nA, nB, paramA, paramB);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int nA = 4;
        int nB = 3;
        int paramA = -2000;
        int paramB = 2000;

        double expected = -8.0;
        double actual = solution.theMax(nA, nB, paramA, paramB);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int nA = 5;
        int nB = 5;
        int paramA = 2000;
        int paramB = -2000;

        double expected = 160.0;
        double actual = solution.theMax(nA, nB, paramA, paramB);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int nA = 50;
        int nB = 50;
        int paramA = 10000;
        int paramB = 2000;

        double expected = 5.62949953421312E17;
        double actual = solution.theMax(nA, nB, paramA, paramB);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int nA = 41;
        int nB = 34;
        int paramA = 9876;
        int paramB = -1234;

        double expected = 515323.9982341775;
        double actual = solution.theMax(nA, nB, paramA, paramB);

        assertEquals(expected, actual);
    }

}
