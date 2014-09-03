import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LCMSetEasyTest {

    protected LCMSetEasy solution;

    @Before
    public void setUp() {
        solution = new LCMSetEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] S = new int[]{2, 3, 4, 5};
        int x = 20;

        String expected = "Possible";
        String actual = solution.include(S, x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] S = new int[]{2, 3, 4};
        int x = 611;

        String expected = "Impossible";
        String actual = solution.include(S, x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] S = new int[]{2, 3, 4};
        int x = 12;

        String expected = "Possible";
        String actual = solution.include(S, x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] S = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 24;

        String expected = "Possible";
        String actual = solution.include(S, x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] S = new int[]{100, 200, 300, 400, 500, 600};
        int x = 2000;

        String expected = "Possible";
        String actual = solution.include(S, x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] S = new int[]{100, 200, 300, 400, 500, 600};
        int x = 8000;

        String expected = "Impossible";
        String actual = solution.include(S, x);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] S = new int[]{1000000000, 999999999, 999999998};
        int x = 999999999;

        String expected = "Possible";
        String actual = solution.include(S, x);

        Assert.assertEquals(expected, actual);
    }

}
