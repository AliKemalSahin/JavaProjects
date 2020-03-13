
import java.util.Scanner;

public class HesapMakinesi {
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
        System.out.println("Secimler:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        
        
        while(!secim.equals("q")){
          System.out.println("Secim Giriniz --> ");  
          secim=scan.next();     
            
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
        }
        
        
        
    
    
}
