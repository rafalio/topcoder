import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CandyAddictTest {

    protected CandyAddict solution;

    @Before
    public void setUp() {
        solution = new CandyAddict();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] X = new int[]{5};
        int[] Y = new int[]{3};
        int[] Z = new int[]{3};

        long[] expected = new long[]{6L};
        long[] actual = solution.solve(X, Y, Z);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] X = new int[]{5, 5, 5, 5, 5};
        int[] Y = new int[]{3, 3, 3, 3, 3};
        int[] Z = new int[]{1, 2, 3, 4, 5};

        long[] expected = new long[]{2L, 1L, 6L, 2L, 7L};
        long[] actual = solution.solve(X, Y, Z);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 20000)
    public void testCase2() {
        int[] X = new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000};
        int[] Y = new int[]{1, 2, 3, 999999998, 999999999};
        int[] Z = new int[]{342568368, 560496730, 586947396, 386937583, 609483745};

        long[] expected = new long[]{342568367000000000L, 60496729000000000L, 253614062000000001L, 773875166L, 609483745L};
        long[] actual = solution.solve(X, Y, Z);

        Assert.assertArrayEquals(expected, actual);
    }

}
