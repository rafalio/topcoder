import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ErasingCharactersTest {

    protected ErasingCharacters solution;

    @Before
    public void setUp() {
        solution = new ErasingCharacters();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = "cieeilll";

        String expected = "cl";
        String actual = solution.simulate(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = "topcoder";

        String expected = "topcoder";
        String actual = solution.simulate(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "abcdefghijklmnopqrstuvwxyyxwvutsrqponmlkjihgfedcba";

        String expected = "";
        String actual = solution.simulate(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = "bacaabaccbaaccabbcabbacabcbba";

        String expected = "bacbaca";
        String actual = solution.simulate(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String s = "eel";

        String expected = "l";
        String actual = solution.simulate(s);

        Assert.assertEquals(expected, actual);
    }

}
