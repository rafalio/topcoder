import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoubleLetterTest {

    protected DoubleLetter solution;

    @Before
    public void setUp() {
        solution = new DoubleLetter();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "aabccb";

        String expected = "Possible";
        String actual = solution.ableToSolve(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "aabccbb";

        String expected = "Impossible";
        String actual = solution.ableToSolve(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "abcddcba";

        String expected = "Possible";
        String actual = solution.ableToSolve(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "abab";

        String expected = "Impossible";
        String actual = solution.ableToSolve(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "aaaaaaaaaa";

        String expected = "Possible";
        String actual = solution.ableToSolve(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String S = "aababbabbaba";

        String expected = "Impossible";
        String actual = solution.ableToSolve(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String S = "zzxzxxzxxzzx";

        String expected = "Possible";
        String actual = solution.ableToSolve(S);

        Assert.assertEquals(expected, actual);
    }

}
