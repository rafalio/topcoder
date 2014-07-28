import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaperAndPaintEasyTest {

    protected PaperAndPaintEasy solution;

    @Before
    public void setUp() {
        solution = new PaperAndPaintEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int width = 5;
        int height = 6;
        int xfold = 2;
        int cnt = 2;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 2;

        long expected = 21L;
        long actual = solution.computeArea(width, height, xfold, cnt, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int width = 3;
        int height = 13;
        int xfold = 1;
        int cnt = 0;
        int x1 = 1;
        int y1 = 8;
        int x2 = 2;
        int y2 = 12;

        long expected = 35L;
        long actual = solution.computeArea(width, height, xfold, cnt, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int width = 12;
        int height = 12;
        int xfold = 7;
        int cnt = 3;
        int x1 = 3;
        int y1 = 1;
        int x2 = 6;
        int y2 = 2;

        long expected = 124L;
        long actual = solution.computeArea(width, height, xfold, cnt, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int width = 4;
        int height = 5;
        int xfold = 4;
        int cnt = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;

        long expected = 19L;
        long actual = solution.computeArea(width, height, xfold, cnt, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int width = 4;
        int height = 8;
        int xfold = 4;
        int cnt = 3;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;

        long expected = 24L;
        long actual = solution.computeArea(width, height, xfold, cnt, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int width = 4;
        int height = 8;
        int xfold = 3;
        int cnt = 0;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 2;

        long expected = 30L;
        long actual = solution.computeArea(width, height, xfold, cnt, x1, y1, x2, y2);

        Assert.assertEquals(expected, actual);
    }

}
