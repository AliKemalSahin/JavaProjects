
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream("dosya.txt",true);
            String s = "Java Deneme";
            byte[] s_array = s.getBytes();
            fos.write(s_array);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // ****************************************************
        
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dosya.txt");
//            fis.skip(5);
//            System.out.println((char)fis.read());
            
            int deger;
            String a="";
            while(( deger = fis.read())!=-1){
                
                a +=(char) deger;    
                
            }
            System.out.println(a);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                if(fis != null){
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        
        
    }
    
}
