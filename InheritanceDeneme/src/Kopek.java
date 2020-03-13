public class Kopek extends Hayvan{
    private String ses;
    
    public Kopek(String isim, int ayak_sayisi, String yasam_yeri,String ses){
        super(isim,ayak_sayisi,yasam_yeri);
        this.ses = ses;
    }
    public void bastir(){
        super.bastir();
        System.out.println("Ses : "+ses);
    }
    
}
