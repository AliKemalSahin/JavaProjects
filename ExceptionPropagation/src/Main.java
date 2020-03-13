
public class Main {
    public static void ucuncufonk(){
        int a = 12 /0;        
    }
    public static void ikincifonk(){
        ucuncufonk();  
    }   
    public static void birincifonk(){
        ikincifonk();  
    }      
    public static void main(String[] args) {
        
        
        try{
            birincifonk();
        }        
        catch(ArithmeticException e){
            System.out.println("0 a bölünemez");
        }
        
    }
    
}
