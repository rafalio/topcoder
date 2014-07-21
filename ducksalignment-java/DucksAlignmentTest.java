import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DucksAlignmentTest {

    protected DucksAlignment solution;

    @Before
    public void setUp() {
        solution = new DucksAlignment();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] grid = new String[]{".o", "o."};

        int expected = 1;
        int actual = solution.minimumTime(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] grid = new String[]{".o...", "..o..", "....o"};

        int expected = 3;
        int actual = solution.minimumTime(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] grid = new String[]{"o..........", "..o........", ".......o...", "...........", "...........", "...........", "........o..", "..........."};

        int expected = 16;
        int actual = solution.minimumTime(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] grid = new String[]{".........", "....o....", "........."};

        int expected = 0;
        int actual = solution.minimumTime(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] grid = new String[]{"...o..........................", "............................o.", ".o............................", "............o.................", ".................o............", "......................o.......", "......o.......................", "....o.........................", "...............o..............", ".......................o......", "...........................o..", ".......o......................"};

        int expected = 99;
        int actual = solution.minimumTime(grid);

        Assert.assertEquals(expected, actual);
    }

}
