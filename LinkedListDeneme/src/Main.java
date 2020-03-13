
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class Main {
    
    public static int hesapla(LinkedList<Integer> sayilar){
        int max = sayilar.get(0);
        System.out.println("MAX = "+max);
        
        ListIterator<Integer> iterator = sayilar.listIterator();
        
        while(iterator.hasNext()){
            
            if(iterator.next() > max){
                max=iterator.previous();
            }           
        }
 
        return max;
    }

    
    public static void main(String[] args) {
     
        LinkedList<Integer> sayilar = new LinkedList<>();
        Random r = new Random();
        
        ListIterator<Integer> iterator = sayilar.listIterator();
        for(int i = 0 ; i < 10 ; i++){
            
            iterator.add(r.nextInt(100));
            System.out.println(sayilar.get(i));
            
        }
          
//        for(int i = 0 ; i < 10 ; i++)
//        {
//            sayilar.add(r.nextInt(100));
//            System.out.println(sayilar.get(i));
//        }
        System.out.println("Fonkdan Sonra Max = "+hesapla(sayilar));
        
        
        
        
        
        
        
        
        
    }
}
