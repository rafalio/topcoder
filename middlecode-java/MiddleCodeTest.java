import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MiddleCodeTest {

    protected MiddleCode solution;

    @Before
    public void setUp() {
        solution = new MiddleCode();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = "word";

        String expected = "ordw";
        String actual = solution.encode(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = "aaaaa";

        String expected = "aaaaa";
        String actual = solution.encode(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "abacaba";

        String expected = "caabbaa";
        String actual = solution.encode(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = "shjegr";

        String expected = "ejghrs";
        String actual = solution.encode(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String s = "adafaaaadafawafwfasdaa";

        String expected = "afawadafawafaafsadadaa";
        String actual = solution.encode(s);

        Assert.assertEquals(expected, actual);
    }

}
