import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplesAndPearsTest {

    protected ApplesAndPears solution;

    @Before
    public void setUp() {
        solution = new ApplesAndPears();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{".A", "P."};
        int K = 0;

        int expected = 1;
        int actual = solution.getArea(board, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{".A", "P."};
        int K = 1;

        int expected = 2;
        int actual = solution.getArea(board, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{".PP", "PPA", "PAP"};
        int K = 3;

        int expected = 6;
        int actual = solution.getArea(board, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"A.P.PAAPPA", "PPP..P.PPP", "AAP.A.PAPA", "P.PA.AAA.A", "...PA.P.PA", "P..A.A.P..", "PAAP..A.A.", "PAAPPA.APA", ".P.AP.P.AA", "..APAPAA.."};
        int K = 10;

        int expected = 21;
        int actual = solution.getArea(board, K);

        Assert.assertEquals(expected, actual);
    }

}
