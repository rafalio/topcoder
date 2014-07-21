import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LittleElephantAndPermutationDiv2Test {

    protected LittleElephantAndPermutationDiv2 solution;

    @Before
    public void setUp() {
        solution = new LittleElephantAndPermutationDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 1;
        int K = 1;

        long expected = 1L;
        long actual = solution.getNumber(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 2;
        int K = 1;

        long expected = 4L;
        long actual = solution.getNumber(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 3;
        int K = 8;

        long expected = 18L;
        long actual = solution.getNumber(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 10;
        int K = 47;

        long expected = 13168189440000L;
        long actual = solution.getNumber(N, K);

        Assert.assertEquals(expected, actual);
    }

}
