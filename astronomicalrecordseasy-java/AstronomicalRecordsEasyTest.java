import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AstronomicalRecordsEasyTest {

    protected AstronomicalRecordsEasy solution;

    @Before
    public void setUp() {
        solution = new AstronomicalRecordsEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{2, 3, 4, 5};

        int expected = 5;
        int actual = solution.minimalPlanets(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{2, 4, 6, 8};

        int expected = 4;
        int actual = solution.minimalPlanets(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] A = new int[]{1, 2, 3, 5, 6, 8, 9};
        int[] B = new int[]{2, 4, 5, 6, 7, 8, 9};

        int expected = 9;
        int actual = solution.minimalPlanets(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{6, 7, 8, 9};

        int expected = 6;
        int actual = solution.minimalPlanets(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] A = new int[]{200, 500};
        int[] B = new int[]{100, 200, 300, 400, 600, 700, 800, 900};

        int expected = 9;
        int actual = solution.minimalPlanets(A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] B = new int[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int expected = 15;
        int actual = solution.minimalPlanets(A, B);

        Assert.assertEquals(expected, actual);
    }

}
