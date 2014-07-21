import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerOfThreeTest {

    protected PowerOfThree solution;

    @Before
    public void setUp() {
        solution = new PowerOfThree();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int x = 1;
        int y = 3;

        String expected = "Possible";
        String actual = solution.ableToGet(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int x = 0;
        int y = 2;

        String expected = "Possible";
        String actual = solution.ableToGet(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int x = 1;
        int y = 9;

        String expected = "Impossible";
        String actual = solution.ableToGet(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int x = 3;
        int y = 0;

        String expected = "Impossible";
        String actual = solution.ableToGet(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int x = 1;
        int y = 1;

        String expected = "Impossible";
        String actual = solution.ableToGet(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int x = -6890;
        int y = 18252;

        String expected = "Possible";
        String actual = solution.ableToGet(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int x = 1000000000;
        int y = -1000000000;

        String expected = "Impossible";
        String actual = solution.ableToGet(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        int x = 0;
        int y = 0;

        String expected = "Possible";
        String actual = solution.ableToGet(x, y);

        Assert.assertEquals(expected, actual);
    }

}
