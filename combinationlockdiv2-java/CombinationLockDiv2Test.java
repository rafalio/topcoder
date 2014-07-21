import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CombinationLockDiv2Test {

    protected CombinationLockDiv2 solution;

    @Before
    public void setUp() {
        solution = new CombinationLockDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "123";
        String T = "112";

        int expected = 1;
        int actual = solution.minimumMoves(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "1";
        String T = "7";

        int expected = 4;
        int actual = solution.minimumMoves(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "607";
        String T = "607";

        int expected = 0;
        int actual = solution.minimumMoves(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "1234";
        String T = "4567";

        int expected = 3;
        int actual = solution.minimumMoves(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "020";
        String T = "909";

        int expected = 2;
        int actual = solution.minimumMoves(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String S = "4423232218340";
        String T = "6290421476245";

        int expected = 18;
        int actual = solution.minimumMoves(S, T);

        Assert.assertEquals(expected, actual);
    }

}
