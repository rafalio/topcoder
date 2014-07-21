import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MakeSquareTest {

    protected MakeSquare solution;

    @Before
    public void setUp() {
        solution = new MakeSquare();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "abcdabgcd";

        int expected = 1;
        int actual = solution.minChanges(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "abcdeabce";

        int expected = 1;
        int actual = solution.minChanges(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "abcdeabxde";

        int expected = 1;
        int actual = solution.minChanges(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "aabcaabc";

        int expected = 0;
        int actual = solution.minChanges(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "aaaaabaaaaabaaaaa";

        int expected = 2;
        int actual = solution.minChanges(S);

        Assert.assertEquals(expected, actual);
    }

}
