
public class PcMuhendis implements IMuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendis(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    
    @Override
    public void askerlik_durumu() {
       if(askerlik){
           System.out.println("Askerlik Yapıldı.");               
       }
       else
           System.out.println("Askerlik Yapılmadı."); 
    }

    @Override
    public String gano(double derece) {  
        return "Ortalamam : "+ derece;
    }

    @Override
    public void adli_sicil() {
        if (adli_sicil) {
            System.out.println("Adli Sicil Kaydı Var.");
        }
        else
            System.out.println("Adli Sicil Kaydı Yok.");
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar Müh. Olarak Şurda Çalıştım.");
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        
        
    }
    
    
    
}
