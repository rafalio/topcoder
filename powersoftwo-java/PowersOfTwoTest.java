import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowersOfTwoTest {

    protected PowersOfTwo solution;

    @Before
    public void setUp() {
        solution = new PowersOfTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long[] powers = new long[]{1L, 2L};

        long expected = 4L;
        long actual = solution.count(powers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long[] powers = new long[]{1L, 1L, 1L, 1L};

        long expected = 5L;
        long actual = solution.count(powers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long[] powers = new long[]{1L, 2L, 2L, 2L, 4L, 4L, 16L};

        long expected = 32L;
        long actual = solution.count(powers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long[] powers = new long[]{1L, 32L, 1L, 16L, 32L};

        long expected = 18L;
        long actual = solution.count(powers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long[] powers = new long[]{1048576L, 1073741824L, 549755813888L, 70368744177664L, 4398046511104L, 262144L, 1048576L, 2097152L, 8796093022208L, 1048576L, 1048576L, 35184372088832L, 2097152L, 256L, 256L, 256L, 262144L, 1048576L, 1048576L, 70368744177664L, 262144L, 1048576L};

        long expected = 18432L;
        long actual = solution.count(powers);

        Assert.assertEquals(expected, actual);
    }

}
