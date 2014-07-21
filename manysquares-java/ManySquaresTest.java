import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ManySquaresTest {

    protected ManySquares solution;

    @Before
    public void setUp() {
        solution = new ManySquares();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] sticks = new int[]{1, 1, 2, 2, 1, 1, 2};

        int expected = 1;
        int actual = solution.howManySquares(sticks);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] sticks = new int[]{3, 1, 4, 4, 4, 10, 10, 10, 10};

        int expected = 1;
        int actual = solution.howManySquares(sticks);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] sticks = new int[]{1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 3, 3};

        int expected = 3;
        int actual = solution.howManySquares(sticks);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] sticks = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};

        int expected = 0;
        int actual = solution.howManySquares(sticks);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] sticks = new int[]{1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1};

        int expected = 2;
        int actual = solution.howManySquares(sticks);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] sticks = new int[]{2, 2, 4, 4, 8, 8};

        int expected = 0;
        int actual = solution.howManySquares(sticks);

        Assert.assertEquals(expected, actual);
    }

}
