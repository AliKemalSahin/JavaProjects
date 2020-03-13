
import java.util.Arrays;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        
        int[] dizi = new int[15];
        for (int i = 0 ; i < 15 ; i++){
            dizi[i] = r.nextInt(100);
        }
        for (int i = 0 ; i < 15 ; i++){
            System.out.print(dizi[i]+",");
        }        
        int temp=0;
        
        for (int i = 0; i < 15; i++) {                   
            for (int j = 0 ; j < dizi.length-1 ; j++){   
                if(dizi[j] > dizi[j+1]){                 // === Arrays.sort(dizi); 
                    temp=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=temp;
                }            
            }
        }
        System.out.println("\n-------------------------------");
        for (int i = 0 ; i < 15 ; i++){
            System.out.print(dizi[i]+",");
        }       
        
        
        
        
        
    }   
}
