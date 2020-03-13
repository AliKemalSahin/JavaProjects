
public class Yazilimci extends Calisan {
    
    private String diller;

    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getAd()+" "+isletimSistemi+" nı yüklüyorum. ");
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Bilinen Diller --> "+diller);
    }
  

    
}
