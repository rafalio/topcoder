import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxProgressionTest {

    protected FoxProgression solution;

    @Before
    public void setUp() {
        solution = new FoxProgression();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] seq = new int[]{1, 2, 4, 8};

        int expected = 1;
        int actual = solution.theCount(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] seq = new int[]{5, 3, 1};

        int expected = 1;
        int actual = solution.theCount(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] seq = new int[]{1, 1};

        int expected = 1;
        int actual = solution.theCount(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] seq = new int[]{8, 4};

        int expected = 1;
        int actual = solution.theCount(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] seq = new int[]{1};

        int expected = -1;
        int actual = solution.theCount(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] seq = new int[]{4, 8};

        int expected = 2;
        int actual = solution.theCount(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] seq = new int[]{1, 3, 4};

        int expected = 0;
        int actual = solution.theCount(seq);

        Assert.assertEquals(expected, actual);
    }

}
