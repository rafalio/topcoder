import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlushTest {

    protected Flush solution;

    @Before
    public void setUp() {
        solution = new Flush();
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
        int[] suits = new int[]{2, 2, 2, 2};
        int number = 2;

        double expected = 1.1428571428571428;
        double actual = solution.size(suits, number);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] suits = new int[]{1, 4, 7, 10};
        int number = 22;

        double expected = 10.0;
        double actual = solution.size(suits, number);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] suits = new int[]{13, 13, 13, 13};
        int number = 49;

        double expected = 13.0;
        double actual = solution.size(suits, number);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] suits = new int[]{13, 13, 13, 13};
        int number = 26;

        double expected = 8.351195960938014;
        double actual = solution.size(suits, number);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] suits = new int[]{13, 13, 13, 13};
        int number = 0;

        double expected = 0.0;
        double actual = solution.size(suits, number);

        assertEquals(expected, actual);
    }

}
