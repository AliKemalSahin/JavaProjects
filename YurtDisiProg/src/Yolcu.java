
import java.util.Scanner;


public class Yolcu implements YurtDisiKurallar{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu ;

    public Yolcu() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yatırdığınız Para : ");
        harc=scan.nextInt();
        scan.nextLine();
        System.out.println("Herhangi Bir Siyasi Yasaginiz var mı(evet ya da hayır) : ");
        String cevap = scan.nextLine();
        
        if(cevap.equals("evet"))
            siyasiYasak=false;
        else
            siyasiYasak=true;
        
        System.out.println("Vizenir var mı(var ya da yok) : ");
        String cevap2 = scan.nextLine();
        
        if(cevap2.equals("var"))
            vizeDurumu=true;
        else
            vizeDurumu=false;       
        
    }
   

    @Override
    public boolean yurtdisiHarci() {
        if(harc < 15 ){
            System.out.println("Harcınız Yeterli Değil.");
            return false;
        }
        else        
            return true;
            
    }

    @Override
    public boolean siyasiYasak() {
        if(siyasiYasak==false){
            System.out.println("Yurt Dışına Çıkamaz.");
            return false;
        }
        else
            return true;
            
    }

    @Override
    public boolean vizeDurumu() {
        if(vizeDurumu == false){
            System.out.println("Yurt Dışına Çıkamaz.");
            return false;
        }
        else
            return true;
    }
    
    
    
}
