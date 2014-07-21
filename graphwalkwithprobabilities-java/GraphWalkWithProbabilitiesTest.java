import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphWalkWithProbabilitiesTest {

    protected GraphWalkWithProbabilities solution;

    @Before
    public void setUp() {
        solution = new GraphWalkWithProbabilities();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] graph = new String[]{"1"};
        int[] winprob = new int[]{1};
        int[] looseprob = new int[]{1};
        int Start = 0;

        double expected = 0.5;
        double actual = solution.findprob(graph, winprob, looseprob, Start);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] graph = new String[]{"11", "11"};
        int[] winprob = new int[]{60, 40};
        int[] looseprob = new int[]{40, 60};
        int Start = 0;

        double expected = 0.6;
        double actual = solution.findprob(graph, winprob, looseprob, Start);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] graph = new String[]{"11", "11"};
        int[] winprob = new int[]{2, 3};
        int[] looseprob = new int[]{3, 4};
        int Start = 0;

        double expected = 0.4285714285714286;
        double actual = solution.findprob(graph, winprob, looseprob, Start);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] graph = new String[]{"110", "011", "001"};
        int[] winprob = new int[]{2, 1, 10};
        int[] looseprob = new int[]{20, 20, 10};
        int Start = 0;

        double expected = 0.405;
        double actual = solution.findprob(graph, winprob, looseprob, Start);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] graph = new String[]{"111", "111", "011"};
        int[] winprob = new int[]{100, 1, 1};
        int[] looseprob = new int[]{0, 50, 50};
        int Start = 2;

        double expected = 0.5;
        double actual = solution.findprob(graph, winprob, looseprob, Start);

        assertEquals(expected, actual);
    }

}
