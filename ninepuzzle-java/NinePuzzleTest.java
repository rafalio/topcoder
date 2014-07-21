import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NinePuzzleTest {

    protected NinePuzzle solution;

    @Before
    public void setUp() {
        solution = new NinePuzzle();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String init = "BG*YRGRRYR";
        String goal = "BGGY*YRRRR";

        int expected = 0;
        int actual = solution.getMinimumCost(init, goal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String init = "GBBB*BGBBG";
        String goal = "RYYY*YRYYR";

        int expected = 9;
        int actual = solution.getMinimumCost(init, goal);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String init = "RRBR*BRBBB";
        String goal = "BBRB*RBRRR";

        int expected = 1;
        int actual = solution.getMinimumCost(init, goal);

        Assert.assertEquals(expected, actual);
    }

}
