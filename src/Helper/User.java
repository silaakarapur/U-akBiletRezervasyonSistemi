package Helper;


import javax.swing.ComboBoxModel;

public abstract class User {

    int id;
    private String tcno;
    String password;
    String cinsiyet;
    private String name;
    
    public dataBaseConnection conn = new dataBaseConnection();

    public User(int id,String tcno,String password, String cinsiyet,String name) {
        this.conn = new  dataBaseConnection();
        
     this.tcno=tcno;
     this.cinsiyet=cinsiyet;
     this.id=id;
     this.name=name;
     this.password=password;
     
    }
    public User(){
        this.conn = new  dataBaseConnection();
        
        
    }
    public boolean addUser(String name, String tcno, String mail, String password,  String Telefon ,ComboBoxModel cinsiyet){
        return false;
        
    }
    public boolean biletRezerve(String name,String tcno,String telefon,String cinsiyet){
        return false;
        
    }
    public boolean biletRezervasyon(String ad, String soyad, String tc, String telefon, String cinsiyet, String firma, String nereden, String nereye, String kategori, String sınıf){
        return false;
        
    }
    

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gettcno() {
        return tcno;
    }

    public void settcno(String tcno) {
        this.tcno = tcno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

}
