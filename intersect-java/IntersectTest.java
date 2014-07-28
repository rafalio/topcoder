import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectTest {

    protected Intersect solution;

    @Before
    public void setUp() {
        solution = new Intersect();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] x = new int[]{0, 2, 3, -4};
        int[] y = new int[]{17, 1000, 18, 6};

        int expected = 2;
        int actual = solution.area(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{10000, -10000};
        int[] y = new int[]{-10000, 10000};

        int expected = 400000000;
        int actual = solution.area(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{3, 8, 6, 12, 10, 15};
        int[] y = new int[]{7, 17, 7, 17, 7, 17};

        int expected = 0;
        int actual = solution.area(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] x = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int[] y = new int[]{5, 5, 5, 5, 5, 5, 5, 5};

        int expected = 0;
        int actual = solution.area(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] x = new int[]{2, 100, 5, 32, 1000, -20, 47, 12};
        int[] y = new int[]{29, -1000, -800, -200, -900, 300, -600, -650};

        int expected = 1000;
        int actual = solution.area(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] x = new int[]{1, 7, 12, 3, 16, 8, 3, 12};
        int[] y = new int[]{-90, -60, -70, 3, -60, -90, -80, -100};

        int expected = 0;
        int actual = solution.area(x, y);

        Assert.assertEquals(expected, actual);
    }

}
