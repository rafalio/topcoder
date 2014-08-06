import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongLongTripDiv2Test {

    protected LongLongTripDiv2 solution;

    @Before
    public void setUp() {
        solution = new LongLongTripDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long D = 10L;
        int T = 6;
        int B = 3;

        String expected = "Possible";
        String actual = solution.isAble(D, T, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long D = 10L;
        int T = 5;
        int B = 3;

        String expected = "Impossible";
        String actual = solution.isAble(D, T, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long D = 50L;
        int T = 100;
        int B = 2;

        String expected = "Impossible";
        String actual = solution.isAble(D, T, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long D = 120L;
        int T = 10;
        int B = 11;

        String expected = "Impossible";
        String actual = solution.isAble(D, T, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long D = 10L;
        int T = 10;
        int B = 9999;

        String expected = "Possible";
        String actual = solution.isAble(D, T, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        long D = 1000L;
        int T = 100;
        int B = 10;

        String expected = "Possible";
        String actual = solution.isAble(D, T, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        long D = 1000010000100001L;
        int T = 1100011;
        int B = 1000000000;

        String expected = "Possible";
        String actual = solution.isAble(D, T, B);

        Assert.assertEquals(expected, actual);
    }

}
