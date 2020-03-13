import java.util.Scanner;

public class Atm {
    public void calis(Hesap hesap){
        Scanner scan=new Scanner(System.in);
          
        Login login = new Login();
        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("***********************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("***********************************");
        int girisHakki = 3;
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                girisHakki-=1;
                System.out.println("Giriş Başarısız Kalan Giriş Hakkı "+girisHakki);
                
                if(girisHakki == 0){
                    System.out.println("Giriş Hakkınız Bitti...");
                    
                    return; // direk methodu bitirdik.
                }
                    
            }
                
        }
        System.out.println("***********************************");
        
        String islemler= "1. Bakiye Görüntüle\n"
                        +"2.Para Yatırma\n"
                        +"3.Para Çekme\n"
                        +"Çıkış İçin q'ya basın.";
        System.out.println(islemler);
        System.out.println("***********************************");
        
        while(true){
            System.out.println("İşlem Seçiniz :");
            String islem = scan.nextLine();
            
            if(islem.equals("q"))
                break;
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz = "+hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak İstediğiniz Tutar : ");
                int tutar=scan.nextInt();
                scan.nextLine(); // enter için
                hesap.paraYatir(tutar);               
            }
            else if(islem.equals("3")){ 
                System.out.println("Çekmek İstediğiniz Tutar :");
                int tutar=scan.nextInt();
                scan.nextLine(); // enter için
                hesap.paraCek(tutar);
            }
            else
                System.out.println("Geçersiz İşlem...");
            
            
        }
        
        
        
    }
    
}
