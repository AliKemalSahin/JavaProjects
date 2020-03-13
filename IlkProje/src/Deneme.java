import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;


public class Deneme {
    
     public static void ebobBul(int a,int b){
         
         int x = 0;
      if(a<b){
          for(int i=1;i<=a;i++){
              if( (a%i)==0 && (b%i)==0)
                  x =i;
                         
          }
      }
      if(b<a){
          for(int i=1;i<=b;i++){
              if( (a%i)==0 && (b%i)==0)
                  x =i;
                         
          }
      } 
      
         System.out.println("EBOB = "+x);
         
     }
     public static void main(String[] Args){
         Scanner scan=new Scanner(System.in);
         int a,b;
         System.out.println("Bir Sayi Giriniz : ");
         a=scan.nextInt();
         System.out.println("Bir Sayi Giriniz : ");
         b=scan.nextInt();
         
         ebobBul(a,b);

      
 
           
         
         
                 
             
             
             
         }
         
         
     }

