import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndFencingEasyTest {

    protected FoxAndFencingEasy solution;

    @Before
    public void setUp() {
        solution = new FoxAndFencingEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int mov1 = 1;
        int mov2 = 58;
        int d = 1;

        String expected = "Ciel";
        String actual = solution.WhoCanWin(mov1, mov2, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int mov1 = 100;
        int mov2 = 100;
        int d = 100000000;

        String expected = "Draw";
        String actual = solution.WhoCanWin(mov1, mov2, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int mov1 = 100;
        int mov2 = 150;
        int d = 100000000;

        String expected = "Draw";
        String actual = solution.WhoCanWin(mov1, mov2, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int mov1 = 100;
        int mov2 = 250;
        int d = 100000000;

        String expected = "Liss";
        String actual = solution.WhoCanWin(mov1, mov2, d);

        Assert.assertEquals(expected, actual);
    }

}
