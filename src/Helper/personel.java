package Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class personel extends User {

    String adsoyad;
    String telefon;
    Statement st = null;
    ResultSet rs = null;
    Connection con = conn.ConnectionDB();
    PreparedStatement preparedstatement = null;

    public static void getPersonelLİst() {

    }

    public personel(int id, String Tc, String password, String cinsiyet, String name) {
        super(id, Tc, password, cinsiyet, name);
    }

    public personel() {

    }

    public boolean biletal(String name, String tcno, String Telefon, String Cinsiyet) {
        String query = "INSERT INTO customer" + "adsoyad,tcno,telefon" + "?,?,?";
        boolean key = false;
        try {
            st = con.createStatement();
            preparedstatement = con.prepareStatement(query);
            preparedstatement.setString(1, adsoyad);
            preparedstatement.setString(2, tcno);
            preparedstatement.setString(3, telefon);

            preparedstatement.executeUpdate();
            key = true;
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if ((key)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean biletal(String text, String text0, String text1) {
        return false;
        
    }

}
