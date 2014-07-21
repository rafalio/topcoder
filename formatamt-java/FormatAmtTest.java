import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FormatAmtTest {

    protected FormatAmt solution;

    @Before
    public void setUp() {
        solution = new FormatAmt();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int dollars = 123456;
        int cents = 0;

        String expected = "$123,456.00";
        String actual = solution.amount(dollars, cents);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int dollars = 49734321;
        int cents = 9;

        String expected = "$49,734,321.09";
        String actual = solution.amount(dollars, cents);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int dollars = 0;
        int cents = 99;

        String expected = "$0.99";
        String actual = solution.amount(dollars, cents);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int dollars = 249;
        int cents = 30;

        String expected = "$249.30";
        String actual = solution.amount(dollars, cents);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int dollars = 1000;
        int cents = 1;

        String expected = "$1,000.01";
        String actual = solution.amount(dollars, cents);

        Assert.assertEquals(expected, actual);
    }

}
