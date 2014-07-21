import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LittleElephantAndStringTest {

    protected LittleElephantAndString solution;

    @Before
    public void setUp() {
        solution = new LittleElephantAndString();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String A = "ABC";
        String B = "CBA";

        int expected = 2;
        int actual = solution.getNumber(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String A = "A";
        String B = "B";

        int expected = -1;
        int actual = solution.getNumber(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String A = "AAABBB";
        String B = "BBBAAA";

        int expected = 3;
        int actual = solution.getNumber(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String B = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        int expected = 25;
        int actual = solution.getNumber(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String A = "A";
        String B = "A";

        int expected = 0;
        int actual = solution.getNumber(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String A = "DCABA";
        String B = "DACBA";

        int expected = 2;
        int actual = solution.getNumber(A, B);

        Assert.assertEquals(expected, actual);
    }

}
