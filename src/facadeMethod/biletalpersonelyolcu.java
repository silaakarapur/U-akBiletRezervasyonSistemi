package facadeMethod;

import Helper.dataBaseConnection;
import facadeMethod.yolcubiletrezerve;
import facadeMethod.personelbiletrezerve;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class biletalpersonelyolcu implements facadeMethod{

    private final facadeMethod Insort;
    private final facadeMethod Personelinsort;
    public dataBaseConnection conn = new dataBaseConnection();
    public void Insort(){
        Insort.ekle();
    }
    
    public void PersonelInsort(){
        Personelinsort.ekle();
    }
    
    
    
    
    public biletalpersonelyolcu() {

        Insort = (facadeMethod) new yolcubiletrezerve();
        Personelinsort = (facadeMethod) new personelbiletrezerve();

    }
    Statement st = null;
    ResultSet rs = null;
    Connection con = conn.ConnectionDB();
    PreparedStatement preparedstatement = null;

    public boolean Ekleinsort(String adsoyad, String tc, String telefon, String cinsiyet) throws SQLException {

        Insort.ekle();
        String facade = "INSERT INTO bilet" + "(adsoyad,tc,telefon,cinsiyet) VALUES" + "(?,?,?,?)";
        boolean key = false;

        try {
            st = con.createStatement();
            preparedstatement = con.prepareStatement(facade);

            preparedstatement.setString(1, adsoyad);
            preparedstatement.setString(2, tc);
            preparedstatement.setString(3, telefon);
            preparedstatement.setString(4, cinsiyet);
            
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

    public void EklePersonelinsort() {
        Personelinsort.ekle();
    }

    void Ekleinsort() {

    }

    @Override
    public boolean ekle(String adsoyad, String tc, String telefon, String cinsiyet) {
        return false;
        
    }

    @Override
    public void ekle() {
      
    }

    @Override
    public boolean biletRezervasyon(String ad, String soyad, String tc, String telefon, String cinsiyet, String firma, String nereden, String nereye, String kategori, String sınıf) {
        return false;
    }

}
