import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuffixArrayDiv2Test {

    protected SuffixArrayDiv2 solution;

    @Before
    public void setUp() {
        solution = new SuffixArrayDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = "abca";

        String expected = "Exists";
        String actual = solution.smallerOne(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = "bbbb";

        String expected = "Exists";
        String actual = solution.smallerOne(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "aaaa";

        String expected = "Does not exist";
        String actual = solution.smallerOne(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = "examplesareveryweakthinktwicebeforesubmit";

        String expected = "Exists";
        String actual = solution.smallerOne(s);

        Assert.assertEquals(expected, actual);
    }

}
