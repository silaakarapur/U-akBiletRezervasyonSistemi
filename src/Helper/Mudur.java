package Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;

public class Mudur extends User {

    Statement st = null;
    ResultSet rs = null;
    Connection con = conn.ConnectionDB();
    PreparedStatement preparedstatement = null;

    public Mudur(int id, String Tc, String password, String cinsiyet, String name) {
        super(id, Tc, password, cinsiyet, name);
    }

    public Mudur() {

    }

    public ArrayList<User> getPersonelList() {
        ArrayList<User> list = new ArrayList<>();

        User Obj;

        try {

            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM personel");
            while (rs.next()) {
                Obj = new User(rs.getInt("id"), rs.getString("tcno"), rs.getString("name"), rs.getString("password"), rs.getString("cinsiyet")) {};
                list.add(Obj);

            }
        } catch (SQLException e) {
        }
        return list;

    }

   
        
    
    public boolean addUser(String name, String tcno, String mail, String password,  String Telefon ,ComboBoxModel cinsiyet){
        String query = "INSERT INTO personel" + "(tcno,name ,password ,cinsiyet) VALUES" + "(?,?,?,?)";
        int key=0;
        
        try {
            st = con.createStatement();
            preparedstatement = con.prepareStatement(query);
            preparedstatement.setString(1, tcno);
            preparedstatement.setString(2, name);
            preparedstatement.setString(3, password);
          
            
            
            preparedstatement.executeUpdate();
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        if((key >=1)){
            return true;
        } else {
            return false;
        }
    }

    public boolean addUser(String text, String text0, String text1, String text2) {
        return false;
        
    }

   

}
