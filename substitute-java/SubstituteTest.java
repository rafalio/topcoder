import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubstituteTest {

    protected Substitute solution;

    @Before
    public void setUp() {
        solution = new Substitute();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String key = "TRADINGFEW";
        String code = "LGXWEV";

        int expected = 709;
        int actual = solution.getValue(key, code);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String key = "ABCDEFGHIJ";
        String code = "XJ";

        int expected = 0;
        int actual = solution.getValue(key, code);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String key = "CRYSTALBUM";
        String code = "MMA";

        int expected = 6;
        int actual = solution.getValue(key, code);

        Assert.assertEquals(expected, actual);
    }

}
