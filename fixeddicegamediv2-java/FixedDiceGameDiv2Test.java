import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FixedDiceGameDiv2Test {

    protected FixedDiceGameDiv2 solution;

    @Before
    public void setUp() {
        solution = new FixedDiceGameDiv2();
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
        int a = 2;
        int b = 2;

        double expected = 2.0;
        double actual = solution.getExpectation(a, b);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int a = 4;
        int b = 2;

        double expected = 3.2;
        double actual = solution.getExpectation(a, b);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int a = 3;
        int b = 3;

        double expected = 2.6666666666666665;
        double actual = solution.getExpectation(a, b);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int a = 11;
        int b = 13;

        double expected = 7.999999999999999;
        double actual = solution.getExpectation(a, b);

        assertEquals(expected, actual);
    }

}
