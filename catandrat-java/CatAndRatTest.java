import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatAndRatTest {

    protected CatAndRat solution;

    @Before
    public void setUp() {
        solution = new CatAndRat();
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
        int R = 10;
        int T = 1;
        int Vrat = 1;
        int Vcat = 1;

        double expected = -1.0;
        double actual = solution.getTime(R, T, Vrat, Vcat);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int R = 10;
        int T = 1;
        int Vrat = 1;
        int Vcat = 2;

        double expected = 1.0;
        double actual = solution.getTime(R, T, Vrat, Vcat);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int R = 10;
        int T = 1;
        int Vrat = 2;
        int Vcat = 1;

        double expected = -1.0;
        double actual = solution.getTime(R, T, Vrat, Vcat);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int R = 1000;
        int T = 1000;
        int Vrat = 1;
        int Vcat = 1000;

        double expected = 1.001001001001001;
        double actual = solution.getTime(R, T, Vrat, Vcat);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int R = 1;
        int T = 1000;
        int Vrat = 1;
        int Vcat = 2;

        double expected = 3.141592653589793;
        double actual = solution.getTime(R, T, Vrat, Vcat);

        assertEquals(expected, actual);
    }

}
