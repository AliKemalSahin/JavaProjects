
public class Main {
    public static void main(String[] args) {
        
        String[] array ={"Elma","Armut","Erik"};
        int[] array2={1,2,3,4,5,6,7,8,9};
        Deneme[] array3 =  {new Deneme("Ali Kemal"),new Deneme("Murat"),new Deneme("Mustafa")};
        Deneme isim = new Deneme("SAYY");
        
        isim.yaz();
        
        for(String a : array){
            System.out.println(a);
        }
        for(int i : array2){
            System.out.println(i);
        }
        for(Deneme d : array3){
            d.yaz();
        }
        
        
    }
    
}
