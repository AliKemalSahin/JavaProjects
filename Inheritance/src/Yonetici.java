
public class Yonetici extends Calisan{  

    private int sorumlu_kisi; // ekstra özellik    
    
    public Yonetici(String isim,int maas,String departman,int sorumlu_kisi){
        super(isim, maas, departman);
        this.sorumlu_kisi=sorumlu_kisi;
    }
    public void bilgileriGoster(){
        //super.bilgileriGoster();
        System.out.println("Sorumlu Kisi Sayısı :"+this.sorumlu_kisi);
    }
    
    
    
}
