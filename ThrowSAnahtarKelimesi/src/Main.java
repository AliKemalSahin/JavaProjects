
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void kontrol(int yas) throws IOException{
        
        if(yas<18){
            throw new IOException();
        }
            
        else
            System.out.println("Hoşgeldiniz.");
        
        
    }
    
    public static void main(String[] args) {
        
        try {
            kontrol(0);
        } catch (IOException ex) {
            System.out.println("IOException olustu.");
        }
        
        
    }
    
}
