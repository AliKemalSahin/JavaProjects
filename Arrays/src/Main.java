
import java.util.Scanner;


public class Main {
    public static void arrayBastir(int [] array){
        for( int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void ortBul(int [] array){
        int toplam=0;
        for( int i=0; i<array.length;i++){
            toplam+=array[i]; 
        }
        System.out.println("Dizinin Ortalaması --> "+toplam/array.length);
    }
    
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
       
        int[] a = new int[5];
        
        for( int i=0; i<5;i++){
            a[i]=scan.nextInt();
        }
        arrayBastir(a);
        ortBul(a);
            
            
        
        
        
        
    }
}
