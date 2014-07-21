import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InterestingDigitsTest {

    protected InterestingDigits solution;

    @Before
    public void setUp() {
        solution = new InterestingDigits();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int base = 10;

        int[] expected = new int[]{3, 9};
        int[] actual = solution.digits(base);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int base = 3;

        int[] expected = new int[]{2};
        int[] actual = solution.digits(base);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int base = 9;

        int[] expected = new int[]{2, 4, 8};
        int[] actual = solution.digits(base);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int base = 26;

        int[] expected = new int[]{5, 25};
        int[] actual = solution.digits(base);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int base = 30;

        int[] expected = new int[]{29};
        int[] actual = solution.digits(base);

        Assert.assertArrayEquals(expected, actual);
    }

}
