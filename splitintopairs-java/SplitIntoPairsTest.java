import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SplitIntoPairsTest {

    protected SplitIntoPairs solution;

    @Before
    public void setUp() {
        solution = new SplitIntoPairs();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] A = new int[]{2, -1};
        int X = -1;

        int expected = 0;
        int actual = solution.makepairs(A, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] A = new int[]{1, -1};
        int X = -1;

        int expected = 1;
        int actual = solution.makepairs(A, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] A = new int[]{-5, -4, 2, 3};
        int X = -1;

        int expected = 2;
        int actual = solution.makepairs(A, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] A = new int[]{5, -7, 8, -2, -5, 3};
        int X = -7;

        int expected = 3;
        int actual = solution.makepairs(A, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] A = new int[]{3, 4, 5, 6, 6, -6, -4, -10, -1, -9};
        int X = -2;

        int expected = 4;
        int actual = solution.makepairs(A, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] A = new int[]{1000000, 1000000};
        int X = -5;

        int expected = 1;
        int actual = solution.makepairs(A, X);

        Assert.assertEquals(expected, actual);
    }

}
