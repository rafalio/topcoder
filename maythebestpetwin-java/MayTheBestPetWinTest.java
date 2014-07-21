import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MayTheBestPetWinTest {

    protected MayTheBestPetWin solution;

    @Before
    public void setUp() {
        solution = new MayTheBestPetWin();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] A = new int[]{3, 4, 4, 7};
        int[] B = new int[]{3, 4, 4, 7};

        int expected = 2;
        int actual = solution.calc(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] A = new int[]{1, 3, 5, 4, 5};
        int[] B = new int[]{2, 5, 6, 8, 7};

        int expected = 5;
        int actual = solution.calc(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] A = new int[]{2907, 949, 1674, 6092, 8608, 5186, 2630, 970, 1050, 2415, 1923, 2697, 5571, 6941, 8065, 4710, 716, 756, 5185, 1341, 993, 5092, 248, 1895, 4223, 1783, 3844, 3531, 2431, 1755, 2837, 4015};
        int[] B = new int[]{7296, 6954, 4407, 9724, 8645, 8065, 9323, 8433, 1352, 9618, 6487, 7309, 9297, 8999, 9960, 5653, 4721, 7623, 6017, 7320, 3513, 6642, 6359, 3145, 7233, 5077, 6457, 3605, 2911, 4679, 5381, 6574};

        int expected = 52873;
        int actual = solution.calc(A, B);

        Assert.assertEquals(expected, actual);
    }

}
