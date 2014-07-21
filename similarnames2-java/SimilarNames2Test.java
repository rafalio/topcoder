import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimilarNames2Test {

    protected SimilarNames2 solution;

    @Before
    public void setUp() {
        solution = new SimilarNames2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] names = new String[]{"kenta", "kentaro", "ken"};
        int L = 2;

        int expected = 3;
        int actual = solution.count(names, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] names = new String[]{"hideo", "hideto", "hideki", "hide"};
        int L = 2;

        int expected = 6;
        int actual = solution.count(names, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] names = new String[]{"aya", "saku", "emi", "ayane", "sakura", "emika", "sakurako"};
        int L = 3;

        int expected = 24;
        int actual = solution.count(names, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] names = new String[]{"taro", "jiro", "hanako"};
        int L = 2;

        int expected = 0;
        int actual = solution.count(names, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] names = new String[]{"alice", "bob", "charlie"};
        int L = 1;

        int expected = 6;
        int actual = solution.count(names, L);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] names = new String[]{"ryota", "ryohei", "ryotaro", "ryo", "ryoga", "ryoma", "ryoko", "ryosuke", "ciel", "lun", "ryuta", "ryuji", "ryuma", "ryujiro", "ryusuke", "ryutaro", "ryu", "ryuhei", "ryuichi", "evima"};
        int L = 3;

        int expected = 276818566;
        int actual = solution.count(names, L);

        Assert.assertEquals(expected, actual);
    }

}
