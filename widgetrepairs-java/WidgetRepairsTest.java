import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WidgetRepairsTest {

    protected WidgetRepairs solution;

    @Before
    public void setUp() {
        solution = new WidgetRepairs();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] arrivals = new int[]{10, 0, 0, 4, 20};
        int numPerDay = 8;

        int expected = 6;
        int actual = solution.days(arrivals, numPerDay);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] arrivals = new int[]{0, 0, 0};
        int numPerDay = 10;

        int expected = 0;
        int actual = solution.days(arrivals, numPerDay);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] arrivals = new int[]{100, 100};
        int numPerDay = 10;

        int expected = 20;
        int actual = solution.days(arrivals, numPerDay);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] arrivals = new int[]{27, 0, 0, 0, 0, 9};
        int numPerDay = 9;

        int expected = 4;
        int actual = solution.days(arrivals, numPerDay);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] arrivals = new int[]{6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6};
        int numPerDay = 3;

        int expected = 15;
        int actual = solution.days(arrivals, numPerDay);

        Assert.assertEquals(expected, actual);
    }

}
