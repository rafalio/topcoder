import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoWaysSortingTest {

    protected TwoWaysSorting solution;

    @Before
    public void setUp() {
        solution = new TwoWaysSorting();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] stringList = new String[]{"a", "aa", "bbb"};

        String expected = "both";
        String actual = solution.sortingMethod(stringList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] stringList = new String[]{"c", "bb", "aaa"};

        String expected = "lengths";
        String actual = solution.sortingMethod(stringList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] stringList = new String[]{"etdfgfh", "aio"};

        String expected = "none";
        String actual = solution.sortingMethod(stringList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] stringList = new String[]{"aaa", "z"};

        String expected = "lexicographically";
        String actual = solution.sortingMethod(stringList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] stringList = new String[]{"z"};

        String expected = "both";
        String actual = solution.sortingMethod(stringList);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] stringList = new String[]{"abcdef", "bcdef", "cdef", "def", "ef", "f", "topcoder"};

        String expected = "lexicographically";
        String actual = solution.sortingMethod(stringList);

        Assert.assertEquals(expected, actual);
    }

}
