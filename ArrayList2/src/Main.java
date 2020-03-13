
import java.util.ArrayList;


public class Main {
    
    public static ArrayList degistir(ArrayList<Integer> arrayList ){

       for(int i =0; i<arrayList.size(); i++){   
        
               arrayList.set(i,i*2);
               System.out.println(arrayList.get(i));               
       }
        return arrayList;
    }
    
    public static void main(String[] Args){
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Merhaba");
        arrayList.add("Selam");
              
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        
        for(int i =0; i<10; i++){           
               arrayList2.add(0);
        }

        
        
        degistir(arrayList2);

        for(int i =0; i<arrayList2.size(); i++){           
               System.out.println(arrayList2.get(i));
        }
        

        

        
        
        
        
        
        
        
        
        
        
    }   
}
