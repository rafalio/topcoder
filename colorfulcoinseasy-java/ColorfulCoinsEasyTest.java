import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColorfulCoinsEasyTest {

    protected ColorfulCoinsEasy solution;

    @Before
    public void setUp() {
        solution = new ColorfulCoinsEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] values = new int[]{1};

        String expected = "Possible";
        String actual = solution.isPossible(values);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] values = new int[]{1, 3};

        String expected = "Possible";
        String actual = solution.isPossible(values);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] values = new int[]{1, 2, 4};

        String expected = "Impossible";
        String actual = solution.isPossible(values);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] values = new int[]{1, 5, 15, 90};

        String expected = "Possible";
        String actual = solution.isPossible(values);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] values = new int[]{1, 4, 20, 60, 180, 1440, 5760};

        String expected = "Impossible";
        String actual = solution.isPossible(values);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] values = new int[]{1, 7, 21, 105, 630, 3150, 18900};

        String expected = "Possible";
        String actual = solution.isPossible(values);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] values = new int[]{1, 10, 30, 300, 900, 9000, 18000};

        String expected = "Impossible";
        String actual = solution.isPossible(values);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        int[] values = new int[]{1, 2, 10, 40, 200, 1000, 4000, 20000};

        String expected = "Impossible";
        String actual = solution.isPossible(values);

        Assert.assertEquals(expected, actual);
    }

}
