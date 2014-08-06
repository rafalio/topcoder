import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircuitsConstructionTest {

    protected CircuitsConstruction solution;

    @Before
    public void setUp() {
        solution = new CircuitsConstruction();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String circuit = "BXBXX";
        int[] conductors = new int[]{8, 2, 3};

        int expected = 8;
        int actual = solution.maximizeResistance(circuit, conductors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String circuit = "AAXXAXAXX";
        int[] conductors = new int[]{1, 1, 2, 8, 10};

        int expected = 22;
        int actual = solution.maximizeResistance(circuit, conductors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String circuit = "AXBXX";
        int[] conductors = new int[]{8, 2, 3};

        int expected = 11;
        int actual = solution.maximizeResistance(circuit, conductors);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String circuit = "BAAXBXXBXAXXBBAXXBXXAAXXX";
        int[] conductors = new int[]{17, 7, 21, 102, 56, 72, 88, 15, 9, 192, 16, 8, 30};

        int expected = 454;
        int actual = solution.maximizeResistance(circuit, conductors);

        Assert.assertEquals(expected, actual);
    }

}
