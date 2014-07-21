import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionGameTest {

    protected AdditionGame solution;

    @Before
    public void setUp() {
        solution = new AdditionGame();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int A = 3;
        int B = 4;
        int C = 5;
        int N = 3;

        int expected = 13;
        int actual = solution.getMaximumPoints(A, B, C, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int A = 1;
        int B = 1;
        int C = 1;
        int N = 8;

        int expected = 3;
        int actual = solution.getMaximumPoints(A, B, C, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int A = 3;
        int B = 5;
        int C = 48;
        int N = 40;

        int expected = 1140;
        int actual = solution.getMaximumPoints(A, B, C, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int A = 36;
        int B = 36;
        int C = 36;
        int N = 13;

        int expected = 446;
        int actual = solution.getMaximumPoints(A, B, C, N);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int A = 8;
        int B = 2;
        int C = 6;
        int N = 13;

        int expected = 57;
        int actual = solution.getMaximumPoints(A, B, C, N);

        Assert.assertEquals(expected, actual);
    }

}
