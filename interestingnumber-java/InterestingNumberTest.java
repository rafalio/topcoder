import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InterestingNumberTest {

    protected InterestingNumber solution;

    @Before
    public void setUp() {
        solution = new InterestingNumber();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String x = "2002";

        String expected = "Interesting";
        String actual = solution.isInteresting(x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String x = "1001";

        String expected = "Not interesting";
        String actual = solution.isInteresting(x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String x = "41312432";

        String expected = "Interesting";
        String actual = solution.isInteresting(x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String x = "611";

        String expected = "Not interesting";
        String actual = solution.isInteresting(x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String x = "64200246";

        String expected = "Interesting";
        String actual = solution.isInteresting(x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String x = "631413164";

        String expected = "Not interesting";
        String actual = solution.isInteresting(x);

        Assert.assertEquals(expected, actual);
    }

}
