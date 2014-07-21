import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SilverbachConjectureTest {

    protected SilverbachConjecture solution;

    @Before
    public void setUp() {
        solution = new SilverbachConjecture();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int n = 20;

        int[] expected = new int[]{8, 12};
        int[] actual = solution.solve(n);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int n = 30;

        int[] expected = new int[]{15, 15};
        int[] actual = solution.solve(n);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int n = 999;

        int[] expected = new int[]{699, 300};
        int[] actual = solution.solve(n);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int n = 45;

        int[] expected = new int[]{15, 30};
        int[] actual = solution.solve(n);

        Assert.assertArrayEquals(expected, actual);
    }

}
