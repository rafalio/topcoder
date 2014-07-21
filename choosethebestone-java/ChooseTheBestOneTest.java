import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChooseTheBestOneTest {

    protected ChooseTheBestOne solution;

    @Before
    public void setUp() {
        solution = new ChooseTheBestOne();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 3;

        int expected = 2;
        int actual = solution.countNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 6;

        int expected = 6;
        int actual = solution.countNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 10;

        int expected = 8;
        int actual = solution.countNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 1234;

        int expected = 341;
        int actual = solution.countNumber(N);

        Assert.assertEquals(expected, actual);
    }

}
