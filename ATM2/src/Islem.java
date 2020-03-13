
import java.util.Scanner;


public class Islem {
    public void calis(Hesap hesap){
        Scanner scan=new Scanner(System.in);
        Giris giris=new Giris();
        
        if(giris.login(hesap)==true){
            System.out.println("Giris Başarılı....");
        }
        else
            System.out.println("Giriş Başarısız...");
        
        String islemler="1.Bakiye Goruntule\n"
                        +"2.Para Yatir\n"
                        +"3.Para Cek\n";
        
        System.out.println(islemler);
        String sec=scan.nextLine();
        if(sec.equals("1")){
            System.out.println(hesap.getBakiye());
        }
        else if(sec.equals("2")){
            int x=scan.nextInt();
            hesap.paraYatir(x);
        }
        else if(sec.equals("3")){
            int x=scan.nextInt();
            hesap.paraCek(x);
        }
        else
            return;
                        
        
        
        
    }
  
    
    
}
