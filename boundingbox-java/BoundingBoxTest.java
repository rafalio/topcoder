import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoundingBoxTest {

    protected BoundingBox solution;

    @Before
    public void setUp() {
        solution = new BoundingBox();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] X = new int[]{0, 1};
        int[] Y = new int[]{1, 0};

        int expected = 1;
        int actual = solution.smallestArea(X, Y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] X = new int[]{0, -2, -1};
        int[] Y = new int[]{-1, -1, -2};

        int expected = 2;
        int actual = solution.smallestArea(X, Y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] X = new int[]{0, 0, 1, 0, -1, 2};
        int[] Y = new int[]{0, 1, 2, -2, 0, -1};

        int expected = 12;
        int actual = solution.smallestArea(X, Y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] X = new int[]{9, -88, -40, 98, -55, 41, -38};
        int[] Y = new int[]{-65, 56, -67, 7, -58, 33, 68};

        int expected = 25110;
        int actual = solution.smallestArea(X, Y);

        Assert.assertEquals(expected, actual);
    }

}
