import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AmebaDiv2Test {

    protected AmebaDiv2 solution;

    @Before
    public void setUp() {
        solution = new AmebaDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] X = new int[]{2, 1, 3, 1, 2};
        int A = 1;

        int expected = 4;
        int actual = solution.simulate(X, A);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] X = new int[]{1, 4, 9, 16, 25, 36, 49};
        int A = 10;

        int expected = 10;
        int actual = solution.simulate(X, A);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] X = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 1024, 2048};
        int A = 1;

        int expected = 512;
        int actual = solution.simulate(X, A);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] X = new int[]{817, 832, 817, 832, 126, 817, 63, 63, 126, 817, 832, 287, 823, 817, 574};
        int A = 63;

        int expected = 252;
        int actual = solution.simulate(X, A);

        Assert.assertEquals(expected, actual);
    }

}
