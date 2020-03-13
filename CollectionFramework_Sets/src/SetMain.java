
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetMain {
    public static void main(String[] args) {
     
        
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        
        
        set1.add("Java");
        set1.add("Phyton");
        set1.add("JavaScript");        
        set1.add("C++");
        set1.add("Php");

        
        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");
  
        
        Set<String> fark = new HashSet<String>(set2); // set2 nin elemanlarına sahip oldu       
        
        System.out.println(fark.removeAll(set1)); 
        System.out.println(fark);
        
        Set<String> kesisim = new HashSet<String>(set2);    
        
        System.out.println(kesisim.retainAll(set1)); 
        System.out.println(kesisim); 
 
        
        
        
        
        
        
        
        
        
        
//        Set<String> set1 = new HashSet<String>();
//        Set<String> set2 = new LinkedHashSet<String>();
//        Set<String> set3 = new TreeSet<String>();
//        
//        
//        set1.add("Java");
//        set1.add("Phyton");
//        set1.add("C++");
//        set1.add("JavaScript");
//        set1.add("Php");
//
//        
//        set2.add("Java");
//        set2.add("Phyton");
//        set2.add("C++");
//        set2.add("JavaScript");
//        set2.add("Php");  
//
//        
//        set3.add("Java");
//        set3.add("Phyton");
//        set3.add("C++");
//        set3.add("JavaScript");
//        set3.add("Php");
//
//        
//        System.out.println("**********************");
//        System.out.println("_____HashSet_____");
//        for(String i : set1){
//            System.out.println(i);
//        }
//        
//        System.out.println("_____LinkedHashSet_____");
//        for(String i : set2){
//            System.out.println(i);
//        }
//        
//        System.out.println("_____TreeSet_____");
//        for(String i : set3){
//            System.out.println(i); 
//        }
//                       
//        if (set1.contains("Phps")){
//            System.out.println("Evet Bulunuyor.");            
//        }
//        else
//            System.out.println("Bulunmuyor.");
        
        
    }
}
