import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciDiv2Test {

    protected FibonacciDiv2 solution;

    @Before
    public void setUp() {
        solution = new FibonacciDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 1;

        int expected = 0;
        int actual = solution.find(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 13;

        int expected = 0;
        int actual = solution.find(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 15;

        int expected = 2;
        int actual = solution.find(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 19;

        int expected = 2;
        int actual = solution.find(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 1000000;

        int expected = 167960;
        int actual = solution.find(N);

        Assert.assertEquals(expected, actual);
    }

}
