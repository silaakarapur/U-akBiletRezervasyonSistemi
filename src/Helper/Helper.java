package Helper;

import javax.swing.JOptionPane;

public class Helper extends User {

    public static void showMsg(String str) {
        String msg;

        switch (str) {
            case "fill":
                msg = "Lütfen tüm alanları doldurunuz";
                break;
            case "success":
                msg = "KAYIT İŞLEMİ BAŞARILI";
                break;
            case "false":
                msg = "Lütfen bilgileri doğru girdiğinize emin olunuz.";
                break;
            default:
                msg = str;
        }
        JOptionPane.showConfirmDialog(null, msg, "mesaj", JOptionPane.INFORMATION_MESSAGE);
    }
}
