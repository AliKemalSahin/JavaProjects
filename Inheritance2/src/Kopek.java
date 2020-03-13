
public class Kopek extends Hayvan{
    
    private int dis_sayisi;
    
    public Kopek(String isim,int kilo,int boy,int bacak_sayisi,int dis_sayisi){
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi=dis_sayisi;
    }
    public void haraketEt(int hız){
        System.out.println("Hayvan "+hız+" ile haraket ediyor.");
    }
    public void Kos(int hız){
        System.out.println("Köpek Koşuyor...");
        super.haraketEt(hız);
    }
    
    
    
    

    /**
     * @return the dis_sayisi
     */
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    /**
     * @param dis_sayisi the dis_sayisi to set
     */
    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }


    
    
    
    
    
}
