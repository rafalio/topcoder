import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PricingTest {

    protected Pricing solution;

    @Before
    public void setUp() {
        solution = new Pricing();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] price = new int[]{9, 1, 5, 5, 5, 5, 4, 8, 80};

        int expected = 120;
        int actual = solution.maxSales(price);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] price = new int[]{17, 50, 2};

        int expected = 69;
        int actual = solution.maxSales(price);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] price = new int[]{130, 110, 90, 13, 6, 5, 4, 3, 0};

        int expected = 346;
        int actual = solution.maxSales(price);

        Assert.assertEquals(expected, actual);
    }

}
