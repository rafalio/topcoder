import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployManagerTest {

    protected EmployManager solution;

    @Before
    public void setUp() {
        solution = new EmployManager();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] value = new int[]{1, 1};
        String[] earning = new String[]{"02", "20"};

        int expected = 0;
        int actual = solution.maximumEarnings(value, earning);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] value = new int[]{2, 2};
        String[] earning = new String[]{"01", "10"};

        int expected = -1;
        int actual = solution.maximumEarnings(value, earning);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] value = new int[]{1, 2, 3, 4};
        String[] earning = new String[]{"0121", "1021", "2201", "1110"};

        int expected = -1;
        int actual = solution.maximumEarnings(value, earning);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] value = new int[]{2, 2, 0, 1, 4, 0, 1, 0, 0, 4};
        String[] earning = new String[]{"0100451253", "1010518123", "0102989242", "0020093171", "4590045480", "5189400676", "1893500826", "2121468008", "5247872007", "3321066870"};

        int expected = 156;
        int actual = solution.maximumEarnings(value, earning);

        Assert.assertEquals(expected, actual);
    }

}
