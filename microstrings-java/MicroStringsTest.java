import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MicroStringsTest {

    protected MicroStrings solution;

    @Before
    public void setUp() {
        solution = new MicroStrings();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int A = 12;
        int D = 5;

        String expected = "1272";
        String actual = solution.makeMicroString(A, D);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int A = 3;
        int D = 2;

        String expected = "31";
        String actual = solution.makeMicroString(A, D);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int A = 31;
        int D = 40;

        String expected = "31";
        String actual = solution.makeMicroString(A, D);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int A = 30;
        int D = 6;

        String expected = "3024181260";
        String actual = solution.makeMicroString(A, D);

        Assert.assertEquals(expected, actual);
    }

}
