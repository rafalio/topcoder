import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LittleElephantAndBallsAgainTest {

    protected LittleElephantAndBallsAgain solution;

    @Before
    public void setUp() {
        solution = new LittleElephantAndBallsAgain();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "RRGGBB";

        int expected = 4;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "R";

        int expected = 0;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "RGBRGB";

        int expected = 5;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "RGGGBB";

        int expected = 3;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "RGBRBRGRGRBBBGRBRBRGBGBBBGRGBBBBRGBGRRGGRRRGRBBBBR";

        int expected = 46;
        int actual = solution.getNumber(S);

        Assert.assertEquals(expected, actual);
    }

}
