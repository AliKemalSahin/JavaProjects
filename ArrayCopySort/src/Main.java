import java.util.Arrays;
import java.util.Scanner;
public class Main {
    
    public static int[] arrayi_doldur(int sayi){
        Scanner scan = new Scanner(System.in);
        int[] cikti = new int[sayi];
        
        for(int i =0;i<sayi;i++){
            cikti[i]=scan.nextInt();
        }
        return cikti;
    }
    public static void array_bastir(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.println("Array["+i+"] = "+array[i]);
        }
    }
    public static void array_sort(int [] array){
        // arrays sınıfı icinde özel methodlar var.
        Arrays.sort(array);
        array_bastir(array);
        
    }
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Girin : ");
        int x = scan.nextInt();  
        int[] array=arrayi_doldur(x);
        array_bastir(array);
        array_sort(array);
        
        int[] a1={1,2,3,4,5,6,7};
        int[] a2={1,2,3,4,5,6,7};
        
        if(Arrays.equals(a1,a2)){
            System.out.println("Eşitler");
        }
    }
      
        
        
        
        
    }
    

