public class Main {
    public static String adv(int x) {
         String output = "";
        if (x <= 0) {
           return "Năm không hợp lệ";
        }
        if (x %4 == 0) {
            output = "Năm nhuận";
        } else {
            output = "Năm thường";
        }
        return output;
    }
}
