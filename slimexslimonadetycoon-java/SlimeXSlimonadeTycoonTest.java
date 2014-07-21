import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SlimeXSlimonadeTycoonTest {

    protected SlimeXSlimonadeTycoon solution;

    @Before
    public void setUp() {
        solution = new SlimeXSlimonadeTycoon();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] morning = new int[]{5, 1, 1};
        int[] customers = new int[]{1, 2, 3};
        int stale_limit = 2;

        int expected = 5;
        int actual = solution.sell(morning, customers, stale_limit);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] morning = new int[]{10, 20, 30};
        int[] customers = new int[]{30, 20, 10};
        int stale_limit = 1;

        int expected = 40;
        int actual = solution.sell(morning, customers, stale_limit);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] morning = new int[]{1, 2, 3, 4, 5};
        int[] customers = new int[]{5, 5, 5, 5, 5};
        int stale_limit = 5;

        int expected = 15;
        int actual = solution.sell(morning, customers, stale_limit);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] morning = new int[]{10000, 0, 0, 0, 0, 0, 0};
        int[] customers = new int[]{1, 2, 4, 8, 16, 32, 64};
        int stale_limit = 4;

        int expected = 15;
        int actual = solution.sell(morning, customers, stale_limit);

        Assert.assertEquals(expected, actual);
    }

}
