import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LittleElephantAndIntervalsDiv2Test {

    protected LittleElephantAndIntervalsDiv2 solution;

    @Before
    public void setUp() {
        solution = new LittleElephantAndIntervalsDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int M = 4;
        int[] L = new int[]{1, 2, 3};
        int[] R = new int[]{1, 2, 3};

        int expected = 8;
        int actual = solution.getNumber(M, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int M = 3;
        int[] L = new int[]{1, 1, 2};
        int[] R = new int[]{3, 1, 3};

        int expected = 4;
        int actual = solution.getNumber(M, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int M = 100;
        int[] L = new int[]{47};
        int[] R = new int[]{74};

        int expected = 2;
        int actual = solution.getNumber(M, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int M = 100;
        int[] L = new int[]{10, 20, 50};
        int[] R = new int[]{20, 50, 100};

        int expected = 8;
        int actual = solution.getNumber(M, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int M = 42;
        int[] L = new int[]{5, 23, 4, 1, 15, 2, 22, 26, 13, 16};
        int[] R = new int[]{30, 41, 17, 1, 21, 6, 28, 30, 15, 19};

        int expected = 512;
        int actual = solution.getNumber(M, L, R);

        Assert.assertEquals(expected, actual);
    }

}
