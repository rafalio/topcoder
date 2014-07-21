import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheatingQuizTest {

    protected CheatingQuiz solution;

    @Before
    public void setUp() {
        solution = new CheatingQuiz();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String answers = "AAAAA";

        int[] expected = new int[]{1, 1, 1, 1, 1};
        int[] actual = solution.howMany(answers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String answers = "AAABBB";

        int[] expected = new int[]{2, 2, 2, 1, 1, 1};
        int[] actual = solution.howMany(answers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String answers = "CAAAAAC";

        int[] expected = new int[]{2, 2, 2, 2, 2, 2, 1};
        int[] actual = solution.howMany(answers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String answers = "BBCA";

        int[] expected = new int[]{3, 3, 2, 1};
        int[] actual = solution.howMany(answers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String answers = "BACACABCBBBBCAAAAACCCABBCAA";

        int[] expected = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 1, 1};
        int[] actual = solution.howMany(answers);

        Assert.assertArrayEquals(expected, actual);
    }

}
