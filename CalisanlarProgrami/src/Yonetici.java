
public class Yonetici extends Calisan{
    
    private int sorumlu_kisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi=sorumlu_kisi;
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı --> "+sorumlu_kisi);
    }
    public void zamYap(int zamMiktar){
        System.out.println(getAd()+" Çalışanlara "+zamMiktar+" zam yapıyor.");
    }
    
    
}
