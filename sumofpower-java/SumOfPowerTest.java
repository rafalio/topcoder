import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumOfPowerTest {

    protected SumOfPower solution;

    @Before
    public void setUp() {
        solution = new SumOfPower();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] array = new int[]{1, 2};

        int expected = 6;
        int actual = solution.findSum(array);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] array = new int[]{1, 1, 1};

        int expected = 10;
        int actual = solution.findSum(array);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] array = new int[]{3, 14, 15, 92, 65};

        int expected = 1323;
        int actual = solution.findSum(array);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int expected = 1210;
        int actual = solution.findSum(array);

        Assert.assertEquals(expected, actual);
    }

}
