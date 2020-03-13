public class Hayvan {
    
    private String isim;
    private int ayak_sayisi;
    private String yasam_yeri;
    
    public Hayvan(String isim, int ayak_sayisi, String yasam_yeri){
        this.isim = isim;
        this.ayak_sayisi = ayak_sayisi;
        this.yasam_yeri = yasam_yeri;    
    }
    public void bastir(){
        System.out.println("İsim : "+isim+", Ayak Sayısı : "+ayak_sayisi+", Yaşam Yeri :"+yasam_yeri);
    }
}
    
    

