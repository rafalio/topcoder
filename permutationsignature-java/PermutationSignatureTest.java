import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermutationSignatureTest {

    protected PermutationSignature solution;

    @Before
    public void setUp() {
        solution = new PermutationSignature();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String signature = "IIIII";

        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual = solution.reconstruct(signature);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String signature = "DI";

        int[] expected = new int[]{2, 1, 3};
        int[] actual = solution.reconstruct(signature);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String signature = "IIIID";

        int[] expected = new int[]{1, 2, 3, 4, 6, 5};
        int[] actual = solution.reconstruct(signature);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String signature = "DIIDID";

        int[] expected = new int[]{2, 1, 3, 5, 4, 7, 6};
        int[] actual = solution.reconstruct(signature);

        Assert.assertArrayEquals(expected, actual);
    }

}
