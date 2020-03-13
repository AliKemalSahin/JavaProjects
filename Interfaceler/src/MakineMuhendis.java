
public class MakineMuhendis implements IMuhendis,ICalisma{

    private boolean askerlik;
    private boolean adli_sicil;

    @Override
    public void calis() {
        System.out.println("Calısıyıroruzz....");
    }

    
    
    
    public MakineMuhendis(boolean askerlik, boolean adli_sicil) {
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
        
        if(array.length==0){
            System.out.println("İş Tecrübesi Yok.");
        }
        else{
            System.out.println("Makine Mühendisi Olarak Çalıştım."); 
            for(int i=0; i<array.length;i++){
                System.out.println(array[i]);
            }
        }
        
    }
    
    public void referans_getir(String[] array){
        if(array.length == 0){
            System.out.println("Herhangi bir referans bulunmuyor.");           
        }
        else{
            System.out.println("Referanslarım");
            for(int i=0; i<array.length;i++){
                System.out.println(array[i]);
            }
        }
        
        
    }
    
    
    
    
}
