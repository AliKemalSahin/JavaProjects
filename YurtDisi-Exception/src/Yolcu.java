
import java.io.PrintWriter;
import java.util.Scanner;

class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasak var.");
    }

}
class VizeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Vizeniz yok.");
    }

}
class HarcException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Harc yetmiyor.");
    }

}
public class Yolcu {
    
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
   

    
    public void yurtdisiHarci() throws HarcException {
        if(harc < 15 ){
            throw new HarcException();
           
        }
        else  
            System.out.println("işlem tamam");
            
    }

   
    public void siyasiYasak() throws SiyasiException {
        if(siyasiYasak==false){
            throw new SiyasiException();
            
        }
        else
            System.out.println("İşlem tamam"); 
            
    }

   
    public void vizeDurumu() throws VizeException {
        if(vizeDurumu == false){
            throw new VizeException();
           
        }
        else
            System.out.println("İşlem tamam"); 
    }
    
    
    
}
