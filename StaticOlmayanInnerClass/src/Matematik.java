
import java.util.Scanner;


public class Matematik {
    
    private double PI=Math.PI;
    
    public class Factorial{
        
        public void faktoriyel(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir Sayı Giriniz : ");
            int sayi = scan.nextInt();
            int fact=1;
            for(int i=1;i<=sayi;i++){
                 fact=fact*i;
            }
            System.out.println("Faktoriyel : "+fact);
        }         
    }
    
    public class Asal{
        
        public boolean asal_mi(int sayi){
            
            int i=2;
            while(i < sayi){
                if(sayi % i==0)  
                    return false;
                
                i++;
            }
            return true;
        }
   
    }
    public class Alan{ 
        
           public class DaireAlan{
                public void daire_alan(int r){
                    System.out.println("Dairenin Alanı : "+(r*r)*PI);
                }
           }
        
        
    }
    
    
    
}
