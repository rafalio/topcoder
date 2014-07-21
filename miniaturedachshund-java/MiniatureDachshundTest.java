import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MiniatureDachshundTest {

    protected MiniatureDachshund solution;

    @Before
    public void setUp() {
        solution = new MiniatureDachshund();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] mikan = new int[]{100, 100, 100, 100, 100};
        int weight = 4750;

        int expected = 2;
        int actual = solution.maxMikan(mikan, weight);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] mikan = new int[]{100, 100, 100, 100, 50};
        int weight = 4750;

        int expected = 3;
        int actual = solution.maxMikan(mikan, weight);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] mikan = new int[]{120, 90, 130, 100, 110, 80};
        int weight = 3000;

        int expected = 6;
        int actual = solution.maxMikan(mikan, weight);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] mikan = new int[]{50};
        int weight = 5000;

        int expected = 0;
        int actual = solution.maxMikan(mikan, weight);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] mikan = new int[]{200, 50, 200, 50, 200, 50, 200, 50};
        int weight = 4800;

        int expected = 4;
        int actual = solution.maxMikan(mikan, weight);

        Assert.assertEquals(expected, actual);
    }

}
