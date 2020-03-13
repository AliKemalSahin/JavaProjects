
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static String harfHesapla(String isim,int vize1,int vize2,int finalnot){
        
        String cikti="";
        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        
        if(toplamnot >= 90){
            cikti = isim+ " bu dersten AA Aldı...";
        }
        else if(toplamnot >= 85){
            cikti = isim+ " bu dersten BA Aldı...";
        }
        else if(toplamnot >=80){
            cikti = isim+ " bu dersten BB Aldı...";
        }
        else if(toplamnot >=75){
            cikti = isim+ " bu dersten CB Aldı...";
        }
        else if(toplamnot >=70){
            cikti = isim+ " bu dersten CC Aldı...";
        }
        else if(toplamnot >=65){
            cikti = isim+ " bu dersten DC Aldı...";
        }
        else if(toplamnot >=55){
            cikti = isim+ " bu dersten FD Aldı...";
        }
        else
            cikti = isim+ " bu dersten FF Aldı...";
        

        
        return cikti;
    }   

    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(new FileReader("dosya.txt"));
                FileWriter writer = new FileWriter("harfnotlari.txt")){
                int i =0;
                while(scan.hasNextLine()){
                    String ogrenciBilgileri = scan.nextLine();
                    String[] ogrenciArray = ogrenciBilgileri.split(",");
                    int vize1=Integer.valueOf(ogrenciArray[i+1]);
                    int vize2=Integer.valueOf(ogrenciArray[i+2]);
                    int finalNotu=Integer.valueOf(ogrenciArray[i+3]);
                    writer.write(harfHesapla(ogrenciArray[i],vize1, vize2, finalNotu)+"\n"); 
                    
                }
                
                
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("Dosya acılamadı.");
        }
                
                
                
                
                
        
        
        
        
    }
}
