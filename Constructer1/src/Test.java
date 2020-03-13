
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Account account1 = new Account();
        Account account2= new Account("123123",1000.0,"Ali Kemal Şahin","alikemalsahin78@gmail.com","4345435");
        
        account1.bilgileriGoster();        
        System.out.println("------------------------------------------------");
        account2.bilgileriGoster();
        
        account2.paraYatir(500);
        account2.paraCek(200);
        
  
        

        

        
    }
    
}
 