import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scan = new Scanner(System.in);
    
    public static void islemleri_bastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }
    public static void sarkici_goruntule(){
        sarkicilar.Sarkicilari_bastir();
    }
    public static void sarkici_ekle(){
        System.out.println("Eklemek İstediginiz Şarkıcı İsmi : ");
        String isim=scan.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle(){
        System.out.println("Güncellemek İstediginiz Şarkıcının Yeri : ");
        int index = scan.nextInt();
        scan.nextLine();
        System.out.println("Güncellemek İstediginiz Şarkıcının Yeni İsmi : ");
        String isim=scan.nextLine();
        sarkicilar.sarkici_guncelle(isim, index-1); // 1 2 3 4 5 girilsin 1 girildiginde 0.cı indexi silsin diye -1
    }
    public static void sil(){
        System.out.println("Silmek İstediginiz Şarkıcının Yeri : ");
        int index = scan.nextInt();
        sarkicilar.sarkici_sil(index-1);
    }
    public static void ara(){
        System.out.println("Aramak İstediginiz Şarkıcının İsmi : ");
        String isim=scan.nextLine();
        sarkicilar.sarkici_ara(isim);
    }
    public static void main(String[] Args){
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz.");
        islemleri_bastir();
        
        boolean cikis=false;
        int islem;
        
        while(!cikis){
            System.out.println("Bir İşlem Seçiniz : ");
            islem=scan.nextInt();
            scan.nextLine();
            switch(islem){
                case 0: islemleri_bastir();
                        break;
                case 1: sarkici_goruntule();
                        break;
                case 2: sarkici_ekle();
                        break;
                case 3: sarkici_guncelle();
                        break;                       
                case 4: sil();
                        break;
                case 5: ara();
                        break;
                case 6: cikis=true;
                        System.out.println("Uygulamadan Çıkılıyor.");
                        break;
                    
                    
                    
            }
            
            
            
            
        }
        
        
        
    }
}