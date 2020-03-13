
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class CarpmaException extends Exception {
    @Override
    public void printStackTrace() {
         System.out.println("Sayı çok büyük küçük giriniz.");
    }

}


public class Main {
     public static void topla(int a,int b) {
        int sonuc=a+b;
        System.out.println("Sonuc --> "+sonuc);
    }
    public static void cikar(int a,int b) {
        int sonuc=a-b;
        System.out.println("Sonuc --> "+sonuc);
    }
    public static void carp(int a,int b) {
        int sonuc=a*b;
        System.out.println("Sonuc --> "+sonuc);
    }
    public static void bol(int a,int b) {
        int sonuc=a/b;
        System.out.println("Sonuc --> "+sonuc);
    }
    public static void topla(int a,int b,int c) { //OVERLOADİNG
        int sonuc=a+b+c;
        System.out.println("Sonuc --> "+sonuc);
    }
    public static void carp(int a,int b,int c) {  //OVERLOADİNG
        int sonuc=a*b*c;
        System.out.println("Sonuc --> "+sonuc);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String secim="a";
        int a,b,c;
        System.out.println("Secimler:\n'+'Toplama\n'-'Cikarma\n'*'Carpma\n'/'Bolme");
        
        
        while(!secim.equals("q")){
          System.out.println("Secim Giriniz --> ");  
          secim=scan.next();     
            
          
        try{  
         switch(secim){
            case "+": {
                System.out.println("Sayilari Giriniz:");
                a=scan.nextInt();
                b=scan.nextInt();
                c=scan.nextInt();
                topla(a,b,c);
                topla(a,b);
                break;
            }
            case "-": {
                System.out.println("Sayilari Giriniz:");
                a=scan.nextInt();
                b=scan.nextInt();
                cikar(a,b);
                break;
            }
            case "*": {
                System.out.println("Sayilari Giriniz:");
                a=scan.nextInt();
                b=scan.nextInt();
                c=scan.nextInt();
                if (a > 10000 && b > 10000) {
                    throw new CarpmaException();
                }
                carp(a,b,c);
                carp(a, b);
                break;
            }
            case "/": {
                System.out.println("Sayilari Giriniz:");
                a=scan.nextInt();
                b=scan.nextInt();
                bol(a,b);
                break;
            }
            
            default: {
                System.out.println("Cikmak icin 'q' giriniz...");
        }
            
         
            
        }
        }
        catch(ArithmeticException e){
            System.out.println("Bir Sayı 0 a bölünemez."+e);
        }
        catch(InputMismatchException e){
            System.out.println("Inputları doğru formatta girin."+e);
        }   catch (CarpmaException ex) {
                ex.printStackTrace();
            }
        
        
    }
}
        
    
    
    
    
    
}
