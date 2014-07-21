import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RaiseThisBarnTest {

    protected RaiseThisBarn solution;

    @Before
    public void setUp() {
        solution = new RaiseThisBarn();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String str = "cc..c.c";

        int expected = 3;
        int actual = solution.calc(str);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String str = "c....c....c";

        int expected = 0;
        int actual = solution.calc(str);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String str = "............";

        int expected = 11;
        int actual = solution.calc(str);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String str = ".c.c...c..ccc.c..c.c.cc..ccc";

        int expected = 3;
        int actual = solution.calc(str);

        Assert.assertEquals(expected, actual);
    }

}
