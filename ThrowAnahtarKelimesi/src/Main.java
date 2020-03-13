
import java.util.Scanner;


public class Main {
    public static void kontrol(int yas){
        if(yas <18){
            throw new ArithmeticException();
        }
        else
            System.out.println("Hoşgeldiniz.");
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int yas = scan.nextInt();
        
        try {
            kontrol(yas);
        } 
        
        catch (ArithmeticException e) {
            System.out.println("18 yasından az giremez");
        }
        
    }
    
}
