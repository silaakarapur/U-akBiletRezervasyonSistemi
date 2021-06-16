/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import Helper.dataBaseConnection;
import View.PersonelGUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sila
 */
public class Yolcu extends verilisteleme{

    public Yolcu(Mediator mediator) {
        super(mediator);
        mediator.yolcuekle(this);
    }

   
   

    

    @Override
    public void biletsil() {
      mediator.yolcubiletsil();
        System.out.println("Yolcu bilet al çalıştı");
    }
    
    @Override
    public void verilistele() {
        mediator.yolcuverilisteleme();
        
        
        System.out.println("yolcu veri listeleme başarılı");
        System.out.println("personel ver ilisteleme başarılı");
         dataBaseConnection c = new dataBaseConnection();
        try {
            Statement st = c.ConnectionDB().createStatement();
            String sql = "select * from rezervasyon";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String tc = rs.getString("tc");
                String telefon = rs.getString("telefon");
                String cinsiyet = rs.getString("cinsiyet");
                String firma = rs.getString("firma");
                String nereden = rs.getString("nereden");
                String nereye = rs.getString("nereye");
                String kategori = rs.getString("kategori");
                String sınıf = rs.getString("sınıf");

                String tbData[] = {id, ad, soyad,tc,telefon,cinsiyet,firma,nereden,nereye,kategori,sınıf};
                System.out.println("veriler tabloya eklendi");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }

    
}
