import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaperRockScisQualsTest {

    protected PaperRockScisQuals solution;

    @Before
    public void setUp() {
        solution = new PaperRockScisQuals();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] players = new String[]{"PPRRS", "PPRRP", "PPRSP", "PPSSP"};

        int expected = 0;
        int actual = solution.whoPassed(players);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] players = new String[]{"RRRRR", "PPPPP", "RRRRR", "PPPPP"};

        int expected = 1;
        int actual = solution.whoPassed(players);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] players = new String[]{"RRRRR", "PPPPP", "SSSSS", "PPPPP"};

        int expected = 2;
        int actual = solution.whoPassed(players);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] players = new String[]{"RRRRR", "PPPPP", "SSSSS", "SSSSS", "RRRRR", "RRRRR"};

        int expected = 0;
        int actual = solution.whoPassed(players);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] players = new String[]{"PPRPS", "RRRPR", "SSPRS", "SSPRR", "PPRSP", "SPRPS", "SPRSP", "PRSPR", "PRSPR"};

        int expected = 6;
        int actual = solution.whoPassed(players);

        Assert.assertEquals(expected, actual);
    }

}
