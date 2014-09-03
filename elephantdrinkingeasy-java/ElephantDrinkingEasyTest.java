import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElephantDrinkingEasyTest {

    protected ElephantDrinkingEasy solution;

    @Before
    public void setUp() {
        solution = new ElephantDrinkingEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] map = new String[]{"NNNNN", "NNYYN", "NYNNN", "NNYNN", "NNNNN"};

        int expected = 4;
        int actual = solution.maxElephants(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] map = new String[]{"YYY", "YYY", "YYY"};

        int expected = 8;
        int actual = solution.maxElephants(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] map = new String[]{"YNYN", "NNYY", "YYNN", "YYYY"};

        int expected = 10;
        int actual = solution.maxElephants(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] map = new String[]{"YNYN", "YNYY", "YYNN", "YYYY"};

        int expected = 10;
        int actual = solution.maxElephants(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] map = new String[]{"YYNYN", "NYNNY", "YNYNN", "YYNYY", "YYNNN"};

        int expected = 12;
        int actual = solution.maxElephants(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] map = new String[]{"YYNYN", "NYNYY", "YNYYN", "YYNYY", "YYNNN"};

        int expected = 13;
        int actual = solution.maxElephants(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] map = new String[]{"NN", "NN"};

        int expected = 0;
        int actual = solution.maxElephants(map);

        Assert.assertEquals(expected, actual);
    }

}
