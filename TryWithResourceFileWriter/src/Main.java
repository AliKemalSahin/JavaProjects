
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("dosya.txt")){
            
            Scanner scan = new Scanner(System.in);
            String dil;
            
            while(true){
                System.out.println("Dil Giriniz:");
                dil = scan.nextLine();
                
                
                if(dil.equals("-1"))
                    break;
               writer.write(dil+"\n"); 
            }
            
            
            
            
            
        } catch (IOException ex) {
            System.out.println("Dosya Acılamadı.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        try(FileWriter writer1 = new FileWriter("dosya.txt"); //otomatik olarak dosyamızı kapatıyor.
//            FileWriter writer2 = new FileWriter("dosya2.txt")){  
//            writer1.write("Deneme\nasdasd");
//            writer2.write("asdasdasd");
//            
//        } catch (IOException ex) {
//            System.out.println("Dosya oluşturulamadı.");
//        }

        
    }
    
}
