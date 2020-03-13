
import java.util.Scanner;


public class Test {
    
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Beyblade programına hoşgeldiniz...");
        System.out.println("Çıkış için q ya basın.");
        
        while(true){
            System.out.print("Hangi Beyblade i üretmek istiyorsunuz:");
            String islem=scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            else{
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                
                Beyblade beyblade = fabrika.beybladeUret(islem);  //polymorphism
                if(beyblade==null){
                    System.out.println("Lütfen geçerli Bir İsim girin:");
                }
                else{
                    beyblade.bilgileriGoster();  // override edilmiş çalışıcak
                    beyblade.saldir();
                    beyblade.kutsalCanavarCikar(); // override edilmiş çalışıcak
                }
            }
            
            
            
        }
        
        
    }
    
}
