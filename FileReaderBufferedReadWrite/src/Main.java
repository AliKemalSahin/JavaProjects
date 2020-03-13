
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
      //  try(Scanner scan = new Scanner(new FileReader("ogrenciler.txt"))){ // konsoldan okumucam dosyadan okucam
          try(Scanner scan = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){ 
            while(scan.hasNextLine()){  //okuyacak baska satır kaldımı 
                
               // System.out.println("Okunan Satır : " + scan.nextLine());
               String bilgi = scan.nextLine();
               String[] array = bilgi.split(",");
               
               if(array[1].equals("bilgisayar")){
                   System.out.println("Array Bilgisi : "+bilgi);
               }
                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("dosya bulunamadı.");
        }
        
        
    }
    
}
// Buffered Writer --> try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))
// writer.write("asdsa");
