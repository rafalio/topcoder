import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CandidatesSelectionEasyTest {

    protected CandidatesSelectionEasy solution;

    @Before
    public void setUp() {
        solution = new CandidatesSelectionEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] score = new String[]{"ACB", "BAC", "CBA"};
        int x = 1;

        int[] expected = new int[]{1, 2, 0};
        int[] actual = solution.sort(score, x);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] score = new String[]{"A", "C", "B", "C", "A"};
        int x = 0;

        int[] expected = new int[]{0, 4, 2, 1, 3};
        int[] actual = solution.sort(score, x);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] score = new String[]{"LAX", "BUR", "ONT", "LGB", "SAN", "SNA", "SFO", "OAK", "SJC"};
        int x = 2;

        int[] expected = new int[]{5, 3, 8, 7, 4, 6, 1, 2, 0};
        int[] actual = solution.sort(score, x);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] score = new String[]{"BBCBABAC", "BCBACABA", "CCCBAACB", "CACABABB", "AABBBBCC"};
        int x = 6;

        int[] expected = new int[]{0, 1, 3, 2, 4};
        int[] actual = solution.sort(score, x);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] score = new String[]{"XXYWZWWYXZ", "YZZZYWYZYW", "ZYZZWZYYWW", "ZWZWZWZXYW", "ZYXWZXWYXY", "YXXXZWXWXW", "XWWYZWXYXY", "XYYXYWYXWY", "ZZYXZYZXYY", "WXZXWYZWYY"};
        int x = 3;

        int[] expected = new int[]{0, 3, 4, 5, 7, 8, 9, 6, 1, 2};
        int[] actual = solution.sort(score, x);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] score = new String[]{"X"};
        int x = 0;

        int[] expected = new int[]{0};
        int[] actual = solution.sort(score, x);

        Assert.assertArrayEquals(expected, actual);
    }

}
