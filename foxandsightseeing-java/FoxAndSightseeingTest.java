import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndSightseeingTest {

    protected FoxAndSightseeing solution;

    @Before
    public void setUp() {
        solution = new FoxAndSightseeing();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] position = new int[]{1, 4, -1, 3};

        int expected = 4;
        int actual = solution.getMin(position);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] position = new int[]{-2, 4, 3};

        int expected = 5;
        int actual = solution.getMin(position);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] position = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int expected = 9;
        int actual = solution.getMin(position);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] position = new int[]{100, -100, 99, -99};

        int expected = 199;
        int actual = solution.getMin(position);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] position = new int[]{74, 84, 92, 23, 5, -70, -47, -59, 24, -86, -39, 99, 85, -42, 54, 100, 47, -3, 42, 38};

        int expected = 836;
        int actual = solution.getMin(position);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] position = new int[]{2, -3, 5, 7, -11, -13, 17, -19, 23, 29, -31, -37, -41, 43, -47, -53, -59, 61, -67, 71};

        int expected = 535;
        int actual = solution.getMin(position);

        Assert.assertEquals(expected, actual);
    }

}
