import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WolfDelaymasterTest {

    protected WolfDelaymaster solution;

    @Before
    public void setUp() {
        solution = new WolfDelaymaster();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String str = "wolf";

        String expected = "VALID";
        String actual = solution.check(str);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String str = "wwolfolf";

        String expected = "INVALID";
        String actual = solution.check(str);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String str = "wolfwwoollffwwwooolllfffwwwwoooollllffff";

        String expected = "VALID";
        String actual = solution.check(str);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String str = "flowolf";

        String expected = "INVALID";
        String actual = solution.check(str);

        Assert.assertEquals(expected, actual);
    }

}
