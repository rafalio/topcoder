import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumbersChallengeTest {

    protected NumbersChallenge solution;

    @Before
    public void setUp() {
        solution = new NumbersChallenge();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] S = new int[]{5, 1, 2};

        int expected = 4;
        int actual = solution.MinNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] S = new int[]{2, 1, 4};

        int expected = 8;
        int actual = solution.MinNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] S = new int[]{2, 1, 2, 7};

        int expected = 6;
        int actual = solution.MinNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] S = new int[]{94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1};

        int expected = 1092;
        int actual = solution.MinNumber(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] S = new int[]{883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13};

        int expected = 56523;
        int actual = solution.MinNumber(S);

        Assert.assertEquals(expected, actual);
    }

}
