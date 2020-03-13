
public class Main {
    public static void kontrol(int yas){
        if(yas <18){
            throw new InvalidAgeException("Invalid age");
        }
        else
            System.out.println("hoşgeldin.");
    }
    
    public static void main(String[] args) {
        try{
        kontrol(12);
        }
        catch(InvalidAgeException e){
            e.printStackTrace();
        }
        
        
    }
    
    
}
