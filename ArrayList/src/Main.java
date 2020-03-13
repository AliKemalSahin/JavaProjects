
import java.util.ArrayList;


public class Main {
    public static void yazdir(ArrayList<String> a){
        for(String i : a){
            System.out.println(i);
        }
        
    }
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        arraylist.add("Metallica");
        arraylist.add("Runss"); 
        arraylist.add("Roses");
        arraylist.add("Moses");
        arraylist.add("Roses");
        for(String i : arraylist){
            System.out.println(i);
        }
        for(int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
        //System.out.println(arraylist.indexOf("Roses"));
        System.out.println(arraylist.lastIndexOf("Roses"));
        arraylist.set(1, "Yeaahhhh");
        
        for(String i : arraylist){
            System.out.println(i);
        }
        
        yazdir(arraylist);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
