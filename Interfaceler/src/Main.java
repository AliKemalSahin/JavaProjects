
public class Main {
    public static void main(String[] Args){
          
        PcMuhendis muhendis = new PcMuhendis(false, false);
        muhendis.askerlik_durumu();
        muhendis.adli_sicil();
        System.out.println(muhendis.gano(3.187));
        String [] tecrube = {"Vestel","Havelsan","Turksat"};
        muhendis.is_tecrubesi(tecrube);
        
        MakineMuhendis makine = new MakineMuhendis(true, false);
        String[] tecrube2 = {};
        String[] referans = {"Ali Kemal","Serhat"};
        makine.adli_sicil();
        makine.askerlik_durumu();
        System.out.println(makine.gano(2.11));
        makine.is_tecrubesi(tecrube2);
        makine.referans_getir(referans);
        makine.calis();
    } 
    
}
