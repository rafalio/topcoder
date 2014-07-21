import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SparseFactorialDiv2Test {

    protected SparseFactorialDiv2 solution;

    @Before
    public void setUp() {
        solution = new SparseFactorialDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long lo = 4L;
        long hi = 8L;
        long divisor = 3L;

        long expected = 3L;
        long actual = solution.getCount(lo, hi, divisor);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long lo = 9L;
        long hi = 11L;
        long divisor = 7L;

        long expected = 1L;
        long actual = solution.getCount(lo, hi, divisor);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long lo = 1L;
        long hi = 1000000000000L;
        long divisor = 2L;

        long expected = 999999999999L;
        long actual = solution.getCount(lo, hi, divisor);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long lo = 16L;
        long hi = 26L;
        long divisor = 11L;

        long expected = 4L;
        long actual = solution.getCount(lo, hi, divisor);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long lo = 10000L;
        long hi = 20000L;
        long divisor = 997L;

        long expected = 1211L;
        long actual = solution.getCount(lo, hi, divisor);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        long lo = 123456789L;
        long hi = 987654321L;
        long divisor = 71L;

        long expected = 438184668L;
        long actual = solution.getCount(lo, hi, divisor);

        Assert.assertEquals(expected, actual);
    }

}
