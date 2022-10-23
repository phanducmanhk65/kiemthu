public class Main {
    public static int Tien_luong(int x) {
        int tien = 0;
        int gio_lam = x;
        if (gio_lam <= 0) return 0;
        else {
            if (gio_lam <= 40) {
                tien = 10 * gio_lam;
            } else {
                tien = 10 * gio_lam + (gio_lam - 40) * 20;
            }
            return tien;

        }
    }

}
