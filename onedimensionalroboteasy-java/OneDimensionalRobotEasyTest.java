import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OneDimensionalRobotEasyTest {

    protected OneDimensionalRobotEasy solution;

    @Before
    public void setUp() {
        solution = new OneDimensionalRobotEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String commands = "RRLRRLLR";
        int A = 10;
        int B = 10;

        int expected = 2;
        int actual = solution.finalPosition(commands, A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String commands = "RRRRR";
        int A = 3;
        int B = 4;

        int expected = 4;
        int actual = solution.finalPosition(commands, A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String commands = "LLLLLLLLLLR";
        int A = 2;
        int B = 6;

        int expected = -1;
        int actual = solution.finalPosition(commands, A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String commands = "RRRRRRRLRRLRRRRRRRRRRRRLRLRRRRRRRRLRRRRRLRRRRRRRRR";
        int A = 5;
        int B = 20;

        int expected = 20;
        int actual = solution.finalPosition(commands, A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String commands = "RLRLLLLLLLRLLLRLLLLLLLLRLLLLLRLLLRRLLLLLRLLLLLRLLL";
        int A = 34;
        int B = 15;

        int expected = -30;
        int actual = solution.finalPosition(commands, A, B);

        Assert.assertEquals(expected, actual);
    }

}
