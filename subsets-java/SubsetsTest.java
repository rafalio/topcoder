import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubsetsTest {

    protected Subsets solution;

    @Before
    public void setUp() {
        solution = new Subsets();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] numbers = new int[]{1, 1, 1};

        int expected = 2;
        int actual = solution.findSubset(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] numbers = new int[]{1, 1, 1, 1, 2, 2, 2, 2};

        int expected = 13;
        int actual = solution.findSubset(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] numbers = new int[]{1, 2, 3, 4};

        int expected = 3;
        int actual = solution.findSubset(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] numbers = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 20, 30, 40, 50};

        int expected = 77;
        int actual = solution.findSubset(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] numbers = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 2, 2, 2};

        int expected = 100;
        int actual = solution.findSubset(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] numbers = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};

        int expected = 8050;
        int actual = solution.findSubset(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] numbers = new int[]{5, 3};

        int expected = 0;
        int actual = solution.findSubset(numbers);

        Assert.assertEquals(expected, actual);
    }

}
