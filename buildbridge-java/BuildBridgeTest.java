import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuildBridgeTest {

    protected BuildBridge solution;

    @Before
    public void setUp() {
        solution = new BuildBridge();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int D = 1;
        int L = 1;

        int expected = 4;
        int actual = solution.howManyCards(D, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int D = 1;
        int L = 6;

        int expected = 1;
        int actual = solution.howManyCards(D, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int D = 3;
        int L = 6;

        int expected = 1;
        int actual = solution.howManyCards(D, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int D = 4;
        int L = 6;

        int expected = 2;
        int actual = solution.howManyCards(D, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int D = 9;
        int L = 1;

        int expected = 36865412;
        int actual = solution.howManyCards(D, L);

        Assert.assertEquals(expected, actual);
    }

}
