
import java.util.Scanner;


public class Main {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mat. Ve Fiz. Problemleri");
        String islemler = "İşlemler\n"
                + "1-Daire Alanı Hesaplama\n"
                + "2-Üçgen Çevresi Hesaplama\n"
                + "3-2 Vektörün İç Çarpımı\n"
                + "Çıkış --> q";
        while(true){
            System.out.println(islemler);
            System.out.println("İşlemi Seç : ");
            String islem = scan.nextLine();
            
            if(islem.equals("q"))
                break;
            else if(islem.equals("1")){
                
                System.out.println("Dairenin Yaricapi : ");
                int r = scan.nextInt();
                scan.nextLine();
                
                Problem.Matematik.daireAlan(r);
                
            }
            else if(islem.equals("2")){
                
                System.out.println("Kenar 1 : ");
                int a = scan.nextInt();
                System.out.println("Kenar 2 : ");
                int b = scan.nextInt();               
                System.out.println("Kenar 3 : ");
                int c = scan.nextInt();   
                scan.nextLine();
                Problem.Matematik.ucgenCevre(a, b, c);
                
            }     
            else if(islem.equals("3")){
                Vec vec1=new Vec("Vec1");
                Vec vec2=new Vec("Vec2");
                Problem.Fizik.icCarpim(vec1, vec2);               
            }
            
        }
   
      
        
        
        
        
    }
    
}
