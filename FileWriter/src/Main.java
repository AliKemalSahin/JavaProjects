
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileWriter fileWriter = null; //bunu yapmamızın sebebi try-catch in içinde tanınmıyor.
        
        try {
            
            fileWriter = new FileWriter("dosya.txt",true); // true devamına yazar bastan olusturmaz
            fileWriter.write("Ali Kemal Sahin\nMerhabaa\n");
            
        } catch (IOException e) {
            System.out.println("Dosya açılamadı.");
        }
        finally{
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    System.out.println("Dosya kapatılırken hata oluştu.");
                }
            }
        }
        
        
        
    }
    
}
