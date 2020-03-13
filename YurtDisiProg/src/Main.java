
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Havalimanına Hoşgeldiniz.");
        String sartlar = "Yurtdışı Çıkış Kuralları..\n"
                + "Siyasi yasağınızın olmaması gerekiyor.\n"
                + "15 TL harç bedeli vardır.\n"
                + "Vizenizin bulunması gerekiyor.\n";
        String message = "Yurtdışı şartlarının hepsini sağlamanız gerekiyor.";
        
        
        while(true){
            System.out.println("************************************************************************************");
            System.out.println(message);
            System.out.println("************************************************************************************");
            System.out.println(sartlar);
            
            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000); // derleyiciyi bekletme!!!
            
            if(yolcu.yurtdisiHarci()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi Yasak kontrol ediliyor...");    
            
            if(yolcu.siyasiYasak()==false){
                System.out.println(message);
                continue;               
            }
            System.out.println("Vize Durumu kontrol ediliyor...");    
            
            if(yolcu.vizeDurumu()==false){
                System.out.println(message);
                continue;               
            }          
            
            System.out.println("\n\tHAYIRLI YOLCULUKLAR.....\n\n\n");
            
        }
        
        
        
        
    }
    
}
