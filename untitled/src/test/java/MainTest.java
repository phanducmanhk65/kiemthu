import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
   // Kiểm thử phân hoạch tương đương
    @Test
    void bi_thoi_hoc() {
        Assertions.assertEquals("Bị buộc thôi học",Main.danh_gia_ket_qua(0.9));
    }

    @Test
    void bi_canh_cao() {
        Assertions.assertEquals("Bị cảnh cáo học vụ",Main.danh_gia_ket_qua(1.5));
    }

    @Test
    void binh_thuong() {
        Assertions.assertEquals("Bình thường",Main.danh_gia_ket_qua(3.5));
    }
    @Test
    void dau_vao_ko_hop_le_1() {
        Assertions.assertEquals("Đầu vào không hợp lệ",Main.danh_gia_ket_qua(-1));

    }

    @Test
    void dau_vao_ko_hop_le_2() {
        Assertions.assertEquals("Đầu vào không hợp lệ",Main.danh_gia_ket_qua(4.7));

    }

    //kiểm thử giá trị biên

     @Test
    void bien_min0() {
        Assertions.assertEquals("Bị buộc thôi học", Main.danh_gia_ket_qua(0.0));

    }

    @Test
    void bien_min1() {
        Assertions.assertEquals("Bị buộc thôi học",Main.danh_gia_ket_qua(0.1));
    }

    @Test
    void bien_norm() {
        Assertions.assertEquals("Bình thường",Main.danh_gia_ket_qua(2));

    }

    @Test
    void bien_max0() {
        Assertions.assertEquals("Bình thường",Main.danh_gia_ket_qua(3.1));
    }

    @Test
    void bien_max1() {
        Assertions.assertEquals("Bình thường",Main.danh_gia_ket_qua(4));

    }


}