import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BigBurgerTest {

    protected BigBurger solution;

    @Before
    public void setUp() {
        solution = new BigBurger();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] arrival = new int[]{3, 3, 9};
        int[] service = new int[]{2, 15, 14};

        int expected = 11;
        int actual = solution.maxWait(arrival, service);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] arrival = new int[]{182};
        int[] service = new int[]{11};

        int expected = 0;
        int actual = solution.maxWait(arrival, service);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] arrival = new int[]{2, 10, 11};
        int[] service = new int[]{3, 4, 3};

        int expected = 3;
        int actual = solution.maxWait(arrival, service);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] arrival = new int[]{2, 10, 12};
        int[] service = new int[]{15, 1, 15};

        int expected = 7;
        int actual = solution.maxWait(arrival, service);

        Assert.assertEquals(expected, actual);
    }

}
