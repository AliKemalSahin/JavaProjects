
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
    public static void gir(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()){
            
            int karsilastir = iterator.next().compareTo(yeni);
            if(karsilastir == 0){
                System.out.println("Listenizde Bu Eleman Zaten var");
                
                return; // methodu sonlandırmak icin kullandık method void oldugu icin bos deger yolladık
            }
            
            else if(karsilastir < 0){  // gönderdigim deger iteratorun degerinden daha büyükse
                
            }
            else if(karsilastir > 0){  // gönderdigim deger iteratorun degerinden kucukse
                iterator.previous();
                iterator.add(yeni);
                
                return ;
            }
            
        }
        iterator.add(yeni);   // burda iterator en sonda oldugu icin sonda ekleme yapıyoruz.
        
        
    }
    public static void bastir(LinkedList<String> gidilecek_yerler){
         
         ListIterator<String> iterator = gidilecek_yerler.listIterator();
         
         while(iterator.hasNext()){
             
             System.out.println(iterator.next());
         }

  
}
    public static void main(String[] Args){
        
        LinkedList<String> gidilecek_yerler = new LinkedList<>();
        
        
        gir(gidilecek_yerler, "postane");
        gir(gidilecek_yerler, "market");
        gir(gidilecek_yerler, "ev");
        gir(gidilecek_yerler, "avlu");
        
        bastir(gidilecek_yerler);
        
        
    }
    
}
