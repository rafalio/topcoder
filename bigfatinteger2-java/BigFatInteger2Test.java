import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BigFatInteger2Test {

    protected BigFatInteger2 solution;

    @Before
    public void setUp() {
        solution = new BigFatInteger2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int A = 6;
        int B = 1;
        int C = 2;
        int D = 1;

        String expected = "divisible";
        String actual = solution.isDivisible(A, B, C, D);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int A = 2;
        int B = 1;
        int C = 6;
        int D = 1;

        String expected = "not divisible";
        String actual = solution.isDivisible(A, B, C, D);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 1000000000;
        int D = 200000000;

        String expected = "divisible";
        String actual = solution.isDivisible(A, B, C, D);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int A = 8;
        int B = 100;
        int C = 4;
        int D = 200;

        String expected = "not divisible";
        String actual = solution.isDivisible(A, B, C, D);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int A = 999999937;
        int B = 1000000000;
        int C = 999999929;
        int D = 1;

        String expected = "not divisible";
        String actual = solution.isDivisible(A, B, C, D);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int A = 2;
        int B = 2;
        int C = 4;
        int D = 1;

        String expected = "divisible";
        String actual = solution.isDivisible(A, B, C, D);

        Assert.assertEquals(expected, actual);
    }

}
