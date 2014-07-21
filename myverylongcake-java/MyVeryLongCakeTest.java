import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyVeryLongCakeTest {

    protected MyVeryLongCake solution;

    @Before
    public void setUp() {
        solution = new MyVeryLongCake();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int n = 6;

        int expected = 4;
        int actual = solution.cut(n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int n = 3;

        int expected = 1;
        int actual = solution.cut(n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int n = 15;

        int expected = 7;
        int actual = solution.cut(n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int n = 1000000000;

        int expected = 600000000;
        int actual = solution.cut(n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int n = 577007436;

        int expected = 384671628;
        int actual = solution.cut(n);

        Assert.assertEquals(expected, actual);
    }

}
