import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaroFriendsTest {

    protected TaroFriends solution;

    @Before
    public void setUp() {
        solution = new TaroFriends();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] coordinates = new int[]{-3, 0, 1};
        int X = 3;

        int expected = 3;
        int actual = solution.getNumber(coordinates, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] coordinates = new int[]{4, 7, -7};
        int X = 5;

        int expected = 4;
        int actual = solution.getNumber(coordinates, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] coordinates = new int[]{-100000000, 100000000};
        int X = 100000000;

        int expected = 0;
        int actual = solution.getNumber(coordinates, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] coordinates = new int[]{3, 7, 4, 6, -10, 7, 10, 9, -5};
        int X = 7;

        int expected = 7;
        int actual = solution.getNumber(coordinates, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] coordinates = new int[]{-4, 0, 4, 0};
        int X = 4;

        int expected = 4;
        int actual = solution.getNumber(coordinates, X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] coordinates = new int[]{7};
        int X = 0;

        int expected = 0;
        int actual = solution.getNumber(coordinates, X);

        Assert.assertEquals(expected, actual);
    }

}
