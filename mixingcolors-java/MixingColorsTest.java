import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MixingColorsTest {

    protected MixingColors solution;

    @Before
    public void setUp() {
        solution = new MixingColors();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] colors = new int[]{1, 7, 3};

        int expected = 3;
        int actual = solution.minColors(colors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] colors = new int[]{10};

        int expected = 1;
        int actual = solution.minColors(colors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] colors = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int expected = 4;
        int actual = solution.minColors(colors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] colors = new int[]{534, 251, 76, 468, 909, 410, 264, 387, 102, 982, 199, 111, 659, 386, 151};

        int expected = 10;
        int actual = solution.minColors(colors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] colors = new int[]{4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int expected = 9;
        int actual = solution.minColors(colors);

        Assert.assertEquals(expected, actual);
    }

}
