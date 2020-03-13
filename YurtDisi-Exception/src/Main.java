
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
            
            
            try{
                yolcu.yurtdisiHarci();
            }
            catch(HarcException e){
                e.printStackTrace();
                continue;
            }
            
            try{
                yolcu.siyasiYasak();
            }
            catch(SiyasiException e){
                e.printStackTrace();
                continue;
            }
            System.out.println("Vize Durumu kontrol ediliyor...");    
            
            try{
                yolcu.vizeDurumu();
            }
            catch(VizeException e){
                e.printStackTrace();
                continue;
            }       
            
           
            
        }
        
        
        
        
    }
    
}
