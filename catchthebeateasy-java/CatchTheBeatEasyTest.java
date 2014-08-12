import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatchTheBeatEasyTest {

    protected CatchTheBeatEasy solution;

    @Before
    public void setUp() {
        solution = new CatchTheBeatEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] x = new int[]{-1, 1, 0};
        int[] y = new int[]{1, 3, 4};

        String expected = "Able to catch";
        String actual = solution.ableToCatchAll(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{-3};
        int[] y = new int[]{2};

        String expected = "Not able to catch";
        String actual = solution.ableToCatchAll(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{-1, 1, 0};
        int[] y = new int[]{1, 2, 4};

        String expected = "Not able to catch";
        String actual = solution.ableToCatchAll(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] x = new int[]{0, -1, 1};
        int[] y = new int[]{9, 1, 3};

        String expected = "Able to catch";
        String actual = solution.ableToCatchAll(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] x = new int[]{70, -108, 52, -70, 84, -29, 66, -33};
        int[] y = new int[]{141, 299, 402, 280, 28, 363, 427, 232};

        String expected = "Not able to catch";
        String actual = solution.ableToCatchAll(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] x = new int[]{-175, -28, -207, -29, -43, -183, -175, -112, -183, -31, -25, -66, -114, -116, -66};
        int[] y = new int[]{320, 107, 379, 72, 126, 445, 318, 255, 445, 62, 52, 184, 247, 245, 185};

        String expected = "Able to catch";
        String actual = solution.ableToCatchAll(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] x = new int[]{0, 0, 0, 0};
        int[] y = new int[]{0, 0, 0, 0};

        String expected = "Able to catch";
        String actual = solution.ableToCatchAll(x, y);

        Assert.assertEquals(expected, actual);
    }

}
