import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WakingUpEasyTest {

    protected WakingUpEasy solution;

    @Before
    public void setUp() {
        solution = new WakingUpEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] volume = new int[]{5, 2, 4};
        int S = 13;

        int expected = 4;
        int actual = solution.countAlarms(volume, S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] volume = new int[]{5, 2, 4};
        int S = 3;

        int expected = 1;
        int actual = solution.countAlarms(volume, S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] volume = new int[]{1};
        int S = 10000;

        int expected = 10000;
        int actual = solution.countAlarms(volume, S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] volume = new int[]{42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, 92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36, 95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69};
        int S = 9999;

        int expected = 203;
        int actual = solution.countAlarms(volume, S);

        Assert.assertEquals(expected, actual);
    }

}
