import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WritingWordsTest {

    protected WritingWords solution;

    @Before
    public void setUp() {
        solution = new WritingWords();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String word = "A";

        int expected = 1;
        int actual = solution.write(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String word = "ABC";

        int expected = 6;
        int actual = solution.write(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String word = "VAMOSGIMNASIA";

        int expected = 143;
        int actual = solution.write(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String word = "TOPCODER";

        int expected = 96;
        int actual = solution.write(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String word = "SINGLEROUNDMATCH";

        int expected = 183;
        int actual = solution.write(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String word = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";

        int expected = 1300;
        int actual = solution.write(word);

        Assert.assertEquals(expected, actual);
    }

}
