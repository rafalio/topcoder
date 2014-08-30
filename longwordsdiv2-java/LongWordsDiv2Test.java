import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongWordsDiv2Test {

    protected LongWordsDiv2 solution;

    @Before
    public void setUp() {
        solution = new LongWordsDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String word = "AAA";

        String expected = "Dislikes";
        String actual = solution.find(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String word = "ABCBA";

        String expected = "Likes";
        String actual = solution.find(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String word = "ABCBAC";

        String expected = "Dislikes";
        String actual = solution.find(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String word = "TOPCODER";

        String expected = "Likes";
        String actual = solution.find(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String word = "VAMOSGIMNASIA";

        String expected = "Dislikes";
        String actual = solution.find(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String word = "SINGLEROUNDMATCH";

        String expected = "Likes";
        String actual = solution.find(word);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String word = "DALELOBO";

        String expected = "Likes";
        String actual = solution.find(word);

        Assert.assertEquals(expected, actual);
    }

}
