import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoLLogoTest {

    protected TwoLLogo solution;

    @Before
    public void setUp() {
        solution = new TwoLLogo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] grid = new String[]{"....", "...."};

        long expected = 1L;
        long actual = solution.countWays(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] grid = new String[]{".##..", "...#.", ".#.#.", "#...#"};

        long expected = 3L;
        long actual = solution.countWays(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] grid = new String[]{"..#.", "#.#.", "....", "..#."};

        long expected = 4L;
        long actual = solution.countWays(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] grid = new String[]{"..", ".."};

        long expected = 0L;
        long actual = solution.countWays(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] grid = new String[]{".#.#", "....", ".#.#", "...."};

        long expected = 34L;
        long actual = solution.countWays(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] grid = new String[]{"##############", "##############", "#.############", "#.############", "#.############", "#.############", "#.############", "#.############", "#.#####.######", "#.#####.######", "#.#####.######", "#....##.######", "#######.######", "#######.######", "#######.######", "#######.######", "#######.######", "#######.######", "#######......#", "##############"};

        long expected = 1350L;
        long actual = solution.countWays(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] grid = new String[]{"#......", ".#....#", ".#.#...", "#....#.", ".##..#.", ".#.....", ".....#.", ".#.#...", ".#...#.", "..##..."};

        long expected = 2386L;
        long actual = solution.countWays(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        String[] grid = new String[]{"...#..........................", "..............................", "..............................", "..................#...#.......", "..................#...........", "..............................", "...........#..................", "..............................", ".....#..#.....................", ".......................#......", "..................#.....#.....", "..............................", "..............................", "..............................", "..............................", "..#...........................", "..............................", "..............................", "..............................", "#............................#", "..............................", ".....#.........#............#.", "..............................", ".........................#....", ".#............................", ".............#................", "..............................", "..............................", ".......................#......", ".............#................"};

        long expected = 5020791386L;
        long actual = solution.countWays(grid);

        Assert.assertEquals(expected, actual);
    }

}
