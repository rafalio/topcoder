import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HappyLetterDiv2Test {

    protected HappyLetterDiv2 solution;

    @Before
    public void setUp() {
        solution = new HappyLetterDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String letters = "aacaaa";

        char expected = 'a';
        char actual = solution.getHappyLetter(letters);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String letters = "dcdjx";

        char expected = '.';
        char actual = solution.getHappyLetter(letters);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String letters = "bcbbbbba";

        char expected = 'b';
        char actual = solution.getHappyLetter(letters);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String letters = "aabc";

        char expected = '.';
        char actual = solution.getHappyLetter(letters);

        Assert.assertEquals(expected, actual);
    }

}
