import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegativeGraphDiv2Test {

    protected NegativeGraphDiv2 solution;

    @Before
    public void setUp() {
        solution = new NegativeGraphDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 3;
        int[] s = new int[]{1, 1, 2, 2, 3, 3};
        int[] t = new int[]{2, 3, 1, 3, 1, 2};
        int[] weight = new int[]{1, 5, 1, 10, 1, 1};
        int charges = 1;

        long expected = -9L;
        long actual = solution.findMin(N, s, t, weight, charges);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 1;
        int[] s = new int[]{1};
        int[] t = new int[]{1};
        int[] weight = new int[]{100};
        int charges = 1000;

        long expected = -100000L;
        long actual = solution.findMin(N, s, t, weight, charges);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 2;
        int[] s = new int[]{1, 1, 2};
        int[] t = new int[]{2, 2, 1};
        int[] weight = new int[]{6, 1, 4};
        int charges = 2;

        long expected = -9L;
        long actual = solution.findMin(N, s, t, weight, charges);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 2;
        int[] s = new int[]{1};
        int[] t = new int[]{2};
        int[] weight = new int[]{98765};
        int charges = 100;

        long expected = -98765L;
        long actual = solution.findMin(N, s, t, weight, charges);

        Assert.assertEquals(expected, actual);
    }

}
