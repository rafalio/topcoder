import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaroCoinsTest {

    protected TaroCoins solution;

    @Before
    public void setUp() {
        solution = new TaroCoins();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long N = 1L;

        long expected = 1L;
        long actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long N = 6L;

        long expected = 3L;
        long actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long N = 47L;

        long expected = 2L;
        long actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long N = 256L;

        long expected = 9L;
        long actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long N = 8489289L;

        long expected = 6853L;
        long actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        long N = 1000000000L;

        long expected = 73411L;
        long actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

}
