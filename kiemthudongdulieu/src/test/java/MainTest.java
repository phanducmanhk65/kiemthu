import junit.framework.TestCase;
public class MainTest extends TestCase {

    public void testTien_luong1() {
        assertEquals(0, Main.Tien_luong(-1));
    }
    public void test_2() {
        assertEquals(250, Main.Tien_luong(25));
    }
    public void test_3() {
        assertEquals(700, Main.Tien_luong(50));
    }
}