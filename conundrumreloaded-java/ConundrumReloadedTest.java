import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConundrumReloadedTest {

    protected ConundrumReloaded solution;

    @Before
    public void setUp() {
        solution = new ConundrumReloaded();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String answers = "LLH";

        int expected = 1;
        int actual = solution.minimumLiars(answers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String answers = "?????";

        int expected = 0;
        int actual = solution.minimumLiars(answers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String answers = "LHLH?";

        int expected = 2;
        int actual = solution.minimumLiars(answers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String answers = "??LLLLLL??";

        int expected = 3;
        int actual = solution.minimumLiars(answers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String answers = "LLL";

        int expected = -1;
        int actual = solution.minimumLiars(answers);

        Assert.assertEquals(expected, actual);
    }

}
