import java.util.Scanner;

public class Giris {
    public boolean login(Hesap hesap){
        Scanner scan=new Scanner(System.in);
        
        String isim=scan.nextLine();
        String parola=scan.nextLine();
        
        if(isim.equals(hesap.getIsim()) && parola.equals(hesap.getSifre())){
            return true;
        }
        else
            return false;
        
        
        
        
        
    }

    void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
