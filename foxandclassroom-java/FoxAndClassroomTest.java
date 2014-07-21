import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndClassroomTest {

    protected FoxAndClassroom solution;

    @Before
    public void setUp() {
        solution = new FoxAndClassroom();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int n = 2;
        int m = 3;

        String expected = "Possible";
        String actual = solution.ableTo(n, m);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int n = 2;
        int m = 2;

        String expected = "Impossible";
        String actual = solution.ableTo(n, m);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int n = 4;
        int m = 6;

        String expected = "Impossible";
        String actual = solution.ableTo(n, m);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int n = 3;
        int m = 6;

        String expected = "Impossible";
        String actual = solution.ableTo(n, m);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int n = 5;
        int m = 7;

        String expected = "Possible";
        String actual = solution.ableTo(n, m);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int n = 10;
        int m = 10;

        String expected = "Impossible";
        String actual = solution.ableTo(n, m);

        Assert.assertEquals(expected, actual);
    }

}
