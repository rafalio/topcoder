import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumSquareEasyTest {

    protected MinimumSquareEasy solution;

    @Before
    public void setUp() {
        solution = new MinimumSquareEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] x = new int[]{0, 1, 2};
        int[] y = new int[]{0, 1, 5};

        long expected = 4L;
        long actual = solution.minArea(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{-1, -1, 0, 2, 0};
        int[] y = new int[]{-2, -1, 0, -1, -2};

        long expected = 9L;
        long actual = solution.minArea(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{1000000000, -1000000000, 1000000000, -1000000000};
        int[] y = new int[]{1000000000, 1000000000, -1000000000, -1000000000};

        long expected = 4000000008000000004L;
        long actual = solution.minArea(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] x = new int[]{93, 34, 12, -11, -7, -21, 51, -22, 59, 74, -19, 29, -56, -95, -96, 9, 44, -37, -54, -21};
        int[] y = new int[]{64, 12, -43, 20, 55, 74, -20, -54, 24, 20, -18, 77, 86, 22, 47, -24, -33, -57, 5, 7};

        long expected = 22801L;
        long actual = solution.minArea(x, y);

        Assert.assertEquals(expected, actual);
    }

}
