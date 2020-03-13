
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
        try {
            //File file = new File("dosya.txt");
            fos = new FileOutputStream("dosya.txt",true);  // sonuna eklemesi için true

            fos.write(65);
            fos.write(74);
            byte[] array ={56,34,76,22,12};
            fos.write(array);
            String s ="ALI KEMAL";
            byte[] s_array = s.getBytes();
            fos.write(s_array);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken hata olustu.");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata olustu.");
            }
        }
        
        
        
        
    }
    
}
