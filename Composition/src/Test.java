

public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("vs197", "Asus","18.5", resolution);
        Kasa kasa = new Kasa("Blade", "Samsung", "demir");
        Anakart anakart = new Anakart("b250", "Nokia", 10, "Windows10");
        
        Bilgisayar pc =new Bilgisayar(monitor, kasa, anakart);
        pc.getKasa().bilgisayarAc(); // bilgisayar.java daki get Kasa kısmı
        pc.getMonitor().MonitorKapat();
        pc.getAnakart().isletimYukle("Ubuntu");
        
         
    }   
    
}
