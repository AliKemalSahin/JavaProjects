
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    public static void main(String[] args) {
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin")) ){
            
            Ogrenci ogrenci1 = new Ogrenci("Ali Kemal", 10, "bilgisayar müh.");
            Ogrenci ogrenci2 = new Ogrenci("Mehmet", 20, "endüstri müh.");
            
            out.writeObject(ogrenci1);   // ogrenci bojesini objeye dönüstürcek yani en üst classa, sonra byte dizisine dönüstürüp
                                        // ogrenci.bin e yazıcak.
            out.writeObject(ogrenci2);
            
        } catch (FileNotFoundException ex) {
            System.out.println("dosya yok");
        } catch (IOException ex) {
            System.out.println("dosya yok");
        }
        
        
    }
    
}
