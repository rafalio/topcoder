import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeftAndRightHandedDiv2Test {

    protected LeftAndRightHandedDiv2 solution;

    @Before
    public void setUp() {
        solution = new LeftAndRightHandedDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "L";

        int expected = 0;
        int actual = solution.count(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "RRR";

        int expected = 0;
        int actual = solution.count(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "LRLRLR";

        int expected = 2;
        int actual = solution.count(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "LLLRRR";

        int expected = 0;
        int actual = solution.count(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "RLRLRL";

        int expected = 3;
        int actual = solution.count(S);

        Assert.assertEquals(expected, actual);
    }

}
