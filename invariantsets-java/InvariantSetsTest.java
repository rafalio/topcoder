import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvariantSetsTest {

    protected InvariantSets solution;

    @Before
    public void setUp() {
        solution = new InvariantSets();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] f = new int[]{1, 0, 0, 0};

        long expected = 5L;
        long actual = solution.countSets(f);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] f = new int[]{1, 2, 0};

        long expected = 2L;
        long actual = solution.countSets(f);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] f = new int[]{0, 0, 1, 2};

        long expected = 5L;
        long actual = solution.countSets(f);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] f = new int[]{0, 1, 2, 3, 4, 5};

        long expected = 64L;
        long actual = solution.countSets(f);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] f = new int[]{12, 10, 0, 4, 0, 6, 3, 8, 9, 14, 1, 5, 6, 12, 5};

        long expected = 90L;
        long actual = solution.countSets(f);

        Assert.assertEquals(expected, actual);
    }

}
