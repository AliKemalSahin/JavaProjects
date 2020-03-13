import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        System.out.println("İdman Programına Hoşgeldiniz.");
        String idmanlar = "Geçerli Hareketler..\n"
                          +"Burpee\n"
                          +"Pushup\n"
                          +"Situp\n"
                          +"Squat";
        System.out.println(idmanlar);
        System.out.println("Bir İdman Oluşturun...");
        
        System.out.println("Burpee Sayisi --> ");
        int burpee=scan.nextInt();
        System.out.println("Pushup Sayisi --> ");
        int pushup=scan.nextInt();
        System.out.println("Situp Sayisi --> ");
        int situp=scan.nextInt();
        System.out.println("Squat Sayisi --> ");
        int squat=scan.nextInt();
        
        scan.nextLine();
        
        Idman idman =new Idman(burpee, pushup, situp, squat);
        System.out.println("İdmanınız Başlıyor...");
        
        while(idman.idmanBittimi() == false){
            
            System.out.println("Hareket Türü(Burpee, Pushup, Situp, Squat):");
            String tur = scan.nextLine();
            System.out.println("Bu hareketten Kaç Tane yapıcaksınız :");
            int sayi=scan.nextInt();
            scan.nextLine(); // güvence
            idman.hareketYap(tur, sayi);
        }
        
        
    }
    
}
