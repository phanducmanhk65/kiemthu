import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {


   @Test
    public void testAdv1() {
        assertEquals("Năm không hợp lệ",Main.adv(-1));
    }


    @Test
    public void testAdv2() {
       assertEquals("Năm nhuận", Main.adv(1012));

    }

    @Test
    public void testAdv3() {
        assertEquals("Năm thường", Main.adv(2022));

    }
}