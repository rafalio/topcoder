import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PairGameEasyTest {

    protected PairGameEasy solution;

    @Before
    public void setUp() {
        solution = new PairGameEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 5;

        String expected = "Able to generate";
        String actual = solution.able(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 1;

        String expected = "Not able to generate";
        String actual = solution.able(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 999;

        String expected = "Not able to generate";
        String actual = solution.able(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 1000;

        String expected = "Able to generate";
        String actual = solution.able(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int a = 47;
        int b = 58;
        int c = 384;
        int d = 221;

        String expected = "Able to generate";
        String actual = solution.able(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int a = 1000;
        int b = 1000;
        int c = 1000;
        int d = 1000;

        String expected = "Able to generate";
        String actual = solution.able(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

}
