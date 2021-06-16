package facadeMethod;



public interface facadeMethod  {

    boolean ekle(String adsoyad, String tc, String telefon, String cinsiyet);
    boolean biletRezervasyon(String ad,String soyad,String tc,String telefon,String cinsiyet,String firma ,String nereden ,String nereye,String kategori,String sınıf);
    
    public void ekle();
}