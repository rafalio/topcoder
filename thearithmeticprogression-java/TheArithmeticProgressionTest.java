import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheArithmeticProgressionTest {

    protected TheArithmeticProgression solution;

    @Before
    public void setUp() {
        solution = new TheArithmeticProgression();
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
        int a = 0;
        int b = 1;
        int c = 2;

        double expected = 0.0;
        double actual = solution.minimumChange(a, b, c);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int a = 0;
        int b = 2;
        int c = 1;

        double expected = 1.5;
        double actual = solution.minimumChange(a, b, c);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int a = 3;
        int b = 2;
        int c = 1;

        double expected = 0.0;
        double actual = solution.minimumChange(a, b, c);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int a = 4;
        int b = 4;
        int c = 8;

        double expected = 2.0;
        double actual = solution.minimumChange(a, b, c);

        assertEquals(expected, actual);
    }

}
