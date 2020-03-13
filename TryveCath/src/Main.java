
public class Main {
    public static void main(String[] args) {
        
     
        try {
            //int a =30/0; //arithmatik exception
            int c=12/0;
            int[] a ={1,2,3,4,5};
            System.out.println(a[6]);
         } 
        catch(ArithmeticException e){
            System.out.println("0 a bölünme hatasi"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dizi hatasi"+e);
        }        
        catch (Exception e) {
            
            //System.out.println("Bir Sayı 0'a bölünemez.."+e);
            System.out.println("Bir hata olustu"+e);
        }
        finally{
            
            System.out.println("Finally bloguuu");
            
        }
        System.out.println("qweqwe");        
        
    }  
}
