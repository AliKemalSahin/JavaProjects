
public class Main {
    public static void main(String[] Args){
       Atm atm = new Atm();
       Hesap hesap = new Hesap("AliKemal","123456",2000); 
       
       atm.calis(hesap);
       System.out.println("Programdan çıkılıyor.");
        
        
    }
    
}
