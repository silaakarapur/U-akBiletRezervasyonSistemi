package Helper;


import View.PersonelGUI;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;

public class Yolcu extends User {

    private String mail;
    private String telefon;

    Statement st = null;
    ResultSet rs = null;
    Connection con = conn.ConnectionDB();
    PreparedStatement preparedstatement = null;

    public Yolcu(int id, String Tc, String password, String cinsiyet, String name) {
        super(id, Tc, password, cinsiyet, name);
    }

    public Yolcu() {

    }
     /*public void biletListele(String id, String biletno, String fima, String Date) throws SQLException{
         dataBaseConnection c = new dataBaseConnection();
          Statement st = c.ConnectionDB().createStatement();
            String sql = "select * from Biletler where tarih";
            ResultSet rs = st.executeQuery(sql);
        
         try {
           
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String tc = rs.getString("tc");
                
                String firma = rs.getString("firma");
               String Date Date date = rs.getDate("tarih");
                String tarih;
                String tbData[] = {id, biletno ,firma ,tarih};
                System.out.println("veriler tabloya eklendi");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


     }*/
    public boolean addYolcu(String name, String tcno, String mail, String password, String telefon, ComboBoxModel cinsiyet) throws SQLException {
        String query = "INSERT INTO custom" + "(name,tcno ,mail ,password, telefon) VALUES" + "(?,?,?,?,?)";
        
        boolean key = false;

        try {
            st = con.createStatement();
            preparedstatement = con.prepareStatement(query);
            preparedstatement.setString(1, name);
            preparedstatement.setString(2, tcno);
            preparedstatement.setString(3, mail);
            preparedstatement.setString(4, password);
            preparedstatement.setString(5, telefon);
            
            

            preparedstatement.executeUpdate();
            key = true;
            System.out.println();
        } catch (SQLException e) {
        }
        if ((key)) {
            return true;
        } else {
            return false;
        }

    }

   /* public boolean bilet(String ad, String soyad, String tc, String telefon) throws SQLException {
        String query = "INSERT INTO" + "(ad,soyad,tc,telefon) VALUES" + "?,?,?,?";
        boolean keys =false;
        try {
            st = con.createStatement();
            preparedstatement = con.prepareStatement(query);
            preparedstatement.setString(1, ad);
            preparedstatement.setString(2, soyad);
            preparedstatement.setString(3, tc);
            preparedstatement.setString(4, telefon);

        }catch(SQLException e){
            e.printStackTrace();
            
        }
         if ((keys)) {
            return true;
        } else {
            return false;
        }


    }*/
    
    @Override
    public boolean addUser(String name, String tcno, String mail, String password, String Telefon, ComboBoxModel cinsiyet) {

        String query = "INSERT INTO yolcu" + "(name,tcno ,mail ,password, Telefon) VALUES" + "(?,?,?,?,?)";
        boolean key = false;

        try {
            st = con.createStatement();
            preparedstatement = con.prepareStatement(query);
            preparedstatement.setString(1, name);
            preparedstatement.setString(2, tcno);
            preparedstatement.setString(3, mail);
            preparedstatement.setString(4, password);
            preparedstatement.setString(5, Telefon);

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



    public boolean biletRezerve(String text, String text0, String text1) {
        return false;
       
    }
    @Override
    public boolean biletRezervasyon(String ad, String soyad, String tc, String telefon, String cinsiyet, String firma, String nereden, String nereye, String kategori, String sınıf) {
        String facade = "INSERT INTO rezervasyon" + "(ad,soyad,tc,telefon,cinsiyet,firma,nereden,nereye,kategori,sınıf) VALUES" + "(?,?,?,?,?,?,?,?,?,?)";
        boolean key = false;

        try {
            st = con.createStatement();
            preparedstatement = con.prepareStatement(facade);

            preparedstatement.setString(1, ad);
            preparedstatement.setString(2, soyad);
            preparedstatement.setString(3, tc);
            preparedstatement.setString(4, telefon);
            preparedstatement.setString(5, cinsiyet);
            preparedstatement.setString(6, firma);
            preparedstatement.setString(7, nereden);
            preparedstatement.setString(8, nereye);
            preparedstatement.setString(9, kategori);
            preparedstatement.setString(10,sınıf);

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

    public boolean biletRezervasyon(String text, String text0, String text1, String text2, Object selectedItem, Object selectedItem0, Object selectedItem1, Object selectedItem2, Object selectedItem3, Object selectedItem4) {
        return false;
       
    }
}
