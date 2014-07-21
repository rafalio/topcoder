import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LittleElephantAndSubsetTest {

    protected LittleElephantAndSubset solution;

    @Before
    public void setUp() {
        solution = new LittleElephantAndSubset();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 3;

        int expected = 7;
        int actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 10;

        int expected = 767;
        int actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 47;

        int expected = 25775;
        int actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 4777447;

        int expected = 66437071;
        int actual = solution.getNumber(N);

        Assert.assertEquals(expected, actual);
    }

}
