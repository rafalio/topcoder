import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuiltingTest {

    protected Quilting solution;

    @Before
    public void setUp() {
        solution = new Quilting();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int length = 3;
        int width = 2;
        String[] colorList = new String[]{"RED", "BLUE", "TAN"};

        String expected = "TAN";
        String actual = solution.lastPatch(length, width, colorList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int length = 4;
        int width = 3;
        String[] colorList = new String[]{"E", "D", "C", "B", "A"};

        String expected = "E";
        String actual = solution.lastPatch(length, width, colorList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int length = 3;
        int width = 3;
        String[] colorList = new String[]{"A", "B", "C", "D"};

        String expected = "C";
        String actual = solution.lastPatch(length, width, colorList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int length = 1;
        int width = 1;
        String[] colorList = new String[]{"RED", "BLUE", "YELLOW"};

        String expected = "RED";
        String actual = solution.lastPatch(length, width, colorList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int length = 10;
        int width = 10;
        String[] colorList = new String[]{"X", "Y", "Z"};

        String expected = "Z";
        String actual = solution.lastPatch(length, width, colorList);

        Assert.assertEquals(expected, actual);
    }

}
