import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CandyMakingTest {

    protected CandyMaking solution;

    @Before
    public void setUp() {
        solution = new CandyMaking();
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
        int[] containerVolume = new int[]{5};
        int[] desiredWeight = new int[]{1000};

        double expected = 0.0;
        double actual = solution.findSuitableDensity(containerVolume, desiredWeight);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] containerVolume = new int[]{10, 10};
        int[] desiredWeight = new int[]{1000, 2000};

        double expected = 1000.0;
        double actual = solution.findSuitableDensity(containerVolume, desiredWeight);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] containerVolume = new int[]{10, 20, 40};
        int[] desiredWeight = new int[]{4000, 2000, 1000};

        double expected = 5250.0;
        double actual = solution.findSuitableDensity(containerVolume, desiredWeight);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] containerVolume = new int[]{1234, 1541, 3321, 1234, 123, 123, 3414, 123, 12, 2442, 1421, 1223, 3232, 1123, 2121};
        int[] desiredWeight = new int[]{3213, 1231, 232143, 44312, 132132, 142424, 123123, 41341, 41244, 21312, 232131, 2312, 2322, 11, 2223};

        double expected = 983673.2727272725;
        double actual = solution.findSuitableDensity(containerVolume, desiredWeight);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] containerVolume = new int[]{30621, 30620, 2};
        int[] desiredWeight = new int[]{1, 1, 1000000};

        double expected = 999999.9999673415;
        double actual = solution.findSuitableDensity(containerVolume, desiredWeight);

        assertEquals(expected, actual);
    }

}
