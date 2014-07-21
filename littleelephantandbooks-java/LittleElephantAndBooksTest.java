import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LittleElephantAndBooksTest {

    protected LittleElephantAndBooks solution;

    @Before
    public void setUp() {
        solution = new LittleElephantAndBooks();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] pages = new int[]{1, 2};
        int number = 1;

        int expected = 2;
        int actual = solution.getNumber(pages, number);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] pages = new int[]{74, 7, 4, 47, 44};
        int number = 3;

        int expected = 58;
        int actual = solution.getNumber(pages, number);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] pages = new int[]{3, 1, 9, 7, 2, 8, 6, 4, 5};
        int number = 7;

        int expected = 29;
        int actual = solution.getNumber(pages, number);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] pages = new int[]{74, 86, 32, 13, 100, 67, 77};
        int number = 2;

        int expected = 80;
        int actual = solution.getNumber(pages, number);

        Assert.assertEquals(expected, actual);
    }

}
