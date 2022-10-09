public class Main {
    public static String danh_gia_ket_qua(double x) {
        if(x < 0 || x > 4.0) {
            return "Đầu vào không hợp lệ";
        } else if(x >=0 && x <1.0){
            return "Bị buộc thôi học";
        } else if(x < 2) {
            return "Bị cảnh cáo học vụ";
        }else {
            return "Bình thường";
        }
    }
}
