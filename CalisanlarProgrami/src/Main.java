import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        Scanner scan =new Scanner(System.in);
        String islem;
        
        System.out.println("Çalışanlar Programına Hoşgeldiniz.");
        String islemler="İşlemler...\n"
                        +"1.Yazılımcı İşlemleri\n"
                        +"2.Yönetici İşlemleri\n"
                        +"3.Çıkış İçin q 'ya Basın";
        System.out.println("--------------------------------------------");
        System.out.println(islemler);
        System.out.println("--------------------------------------------");  
        
        while(true){
            System.out.print("İşlemi Seçiniz:");
            islem=scan.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci=new Yazilimci("Ali Kemal", "Şahin", 1 , "C,C#");
                String YazilimciIslem="1-Format At\n"
                                     +"2-Bilgileri Göster\n"
                                     +"Çıkış İçin q'ya basın.\n"; 
                System.out.println(YazilimciIslem);
                while (true) {  
                    System.out.print("İşlemi Seçiniz:");
                    String yIslem=scan.nextLine();
                    if(yIslem.equals("q")){
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if(yIslem.equals("1")){
                        System.out.println("İşletim Sistemini Girin:");
                        String isletimSistemi=scan.nextLine();
                        yazilimci.formatAt(isletimSistemi);                       
                    }
                    else if(yIslem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz İşlem");
                    }
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici=new Yonetici("Mehmet", "Yıldırım ", 2, 5);
                String yoneticiIslem="1-Zam Yap\n"
                                     +"2-Bilgileri Göster\n" 
                                     +"Çıkış İçin q'ya basın.\n"; 
                System.out.println(yoneticiIslem);
                while (true) {  
                    System.out.print("İşlemi Seçiniz:");
                    String yIslem=scan.nextLine();
                    if(yIslem.equals("q")){
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if(yIslem.equals("1")){
                        System.out.println("Zam Miktarını Girin:");
                        int zam=scan.nextInt();
                        scan.nextLine();
                        yonetici.zamYap(zam);
                    }
                    else if(yIslem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz İşlem");
                    }
                }
            }                                      
            else{
                System.out.println("Geçersiz İşlem");
            }
        }
        
        
        
        
        
    }
    
}
