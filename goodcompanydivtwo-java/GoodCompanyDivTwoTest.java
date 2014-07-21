import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoodCompanyDivTwoTest {

    protected GoodCompanyDivTwo solution;

    @Before
    public void setUp() {
        solution = new GoodCompanyDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] superior = new int[]{-1, 0};
        int[] workType = new int[]{1, 2};

        int expected = 2;
        int actual = solution.countGood(superior, workType);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] superior = new int[]{-1, 0};
        int[] workType = new int[]{1, 1};

        int expected = 1;
        int actual = solution.countGood(superior, workType);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] superior = new int[]{-1, 0, 1, 1};
        int[] workType = new int[]{1, 4, 3, 2};

        int expected = 4;
        int actual = solution.countGood(superior, workType);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] superior = new int[]{-1, 0, 1, 0, 0};
        int[] workType = new int[]{3, 3, 5, 2, 2};

        int expected = 4;
        int actual = solution.countGood(superior, workType);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] superior = new int[]{-1, 0, 1, 1, 1, 0, 2, 5};
        int[] workType = new int[]{1, 1, 2, 3, 4, 5, 3, 3};

        int expected = 7;
        int actual = solution.countGood(superior, workType);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] superior = new int[]{-1, 0, 0, 1, 1, 3, 0, 2, 0, 5, 2, 5, 5, 6, 1, 2, 11, 12, 10, 4, 7, 16, 10, 9, 12, 18, 15, 23, 20, 7, 4};
        int[] workType = new int[]{4, 6, 4, 7, 7, 1, 2, 8, 1, 7, 2, 4, 2, 9, 11, 1, 10, 11, 4, 6, 11, 7, 2, 8, 9, 9, 10, 10, 9, 8, 8};

        int expected = 27;
        int actual = solution.countGood(superior, workType);

        Assert.assertEquals(expected, actual);
    }

}
