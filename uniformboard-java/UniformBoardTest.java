import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniformBoardTest {

    protected UniformBoard solution;

    @Before
    public void setUp() {
        solution = new UniformBoard();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"AP", ".A"};
        int K = 0;

        int expected = 1;
        int actual = solution.getBoard(board, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"AP", ".A"};
        int K = 1;

        int expected = 2;
        int actual = solution.getBoard(board, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"PPP", "APA", "A.P"};
        int K = 2;

        int expected = 3;
        int actual = solution.getBoard(board, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"AAA", "PPP", "AAA"};
        int K = 10;

        int expected = 3;
        int actual = solution.getBoard(board, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{"."};
        int K = 1000;

        int expected = 0;
        int actual = solution.getBoard(board, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] board = new String[]{"PPAAPA..AP", "PPA.APAP..", "..P.AA.PPP", "P.P..APAA.", "P.P..P.APA", "PPA..AP.AA", "APP..AAPAA", "P.P.AP...P", ".P.A.PAPPA", "..PAPAP..P"};
        int K = 10;

        int expected = 15;
        int actual = solution.getBoard(board, K);

        Assert.assertEquals(expected, actual);
    }

}
