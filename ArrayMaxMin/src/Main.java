
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] Args){
     
        Random r=new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin Elemanlarını Giriniz : ");
        
        int dizi[] = new int[10];
        
        for(int i=0 ; i < 10 ; i++){
            dizi[i] = r.nextInt(100);
        }
        for(int i=0 ; i < 10 ; i++){
            System.out.print(dizi[i]+",");
        }
        int max = dizi[0];
        int min = dizi[0];
        for(int i=0 ; i < 10 ; i++){
            if(dizi[i]>max)
                max=dizi[i];
            if(dizi[i]<min)
                min=dizi[i];     
        } 
        System.out.println("-----------------------------\n");
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);       
        
        
        
        
        
        
        
    }    
}
