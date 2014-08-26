import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoxesDiv2Test {

    protected BoxesDiv2 solution;

    @Before
    public void setUp() {
        solution = new BoxesDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] candyCounts = new int[]{8, 8};

        int expected = 16;
        int actual = solution.findSize(candyCounts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] candyCounts = new int[]{5, 6};

        int expected = 16;
        int actual = solution.findSize(candyCounts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] candyCounts = new int[]{1, 7};

        int expected = 16;
        int actual = solution.findSize(candyCounts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] candyCounts = new int[]{1, 1, 13, 1, 1};

        int expected = 32;
        int actual = solution.findSize(candyCounts);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        int[] candyCounts = new int[]{5};

        int expected = 8;
        int actual = solution.findSize(candyCounts);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase6() {
        int[] candyCounts = new int[]{8};

        int expected = 8;
        int actual = solution.findSize(candyCounts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] candyCounts = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};

        int expected = 1024;
        int actual = solution.findSize(candyCounts);

        Assert.assertEquals(expected, actual);
    }

}
