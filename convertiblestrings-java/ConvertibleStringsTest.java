import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConvertibleStringsTest {

    protected ConvertibleStrings solution;

    @Before
    public void setUp() {
        solution = new ConvertibleStrings();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String A = "DD";
        String B = "FF";

        int expected = 0;
        int actual = solution.leastRemovals(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String A = "AAAA";
        String B = "ABCD";

        int expected = 3;
        int actual = solution.leastRemovals(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String A = "AAIAIA";
        String B = "BCDBEE";

        int expected = 3;
        int actual = solution.leastRemovals(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String A = "ABACDCECDCDAAABBFBEHBDFDDHHD";
        String B = "GBGCDCECDCHAAIBBFHEBBDFHHHHE";

        int expected = 9;
        int actual = solution.leastRemovals(A, B);

        Assert.assertEquals(expected, actual);
    }

}
