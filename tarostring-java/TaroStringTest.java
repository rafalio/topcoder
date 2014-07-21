import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaroStringTest {

    protected TaroString solution;

    @Before
    public void setUp() {
        solution = new TaroString();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "XCYAZTX";

        String expected = "Possible";
        String actual = solution.getAnswer(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "CTA";

        String expected = "Impossible";
        String actual = solution.getAnswer(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "ACBBAT";

        String expected = "Impossible";
        String actual = solution.getAnswer(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "SGHDJHFIOPUFUHCHIOJBHAUINUIT";

        String expected = "Possible";
        String actual = solution.getAnswer(S);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "CCCATT";

        String expected = "Impossible";
        String actual = solution.getAnswer(S);

        Assert.assertEquals(expected, actual);
    }

}
