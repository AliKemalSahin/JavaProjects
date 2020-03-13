public class Main {
    
    public static void konustur(Object obje) {
        
        if(obje instanceof Yasli){
            Insan old = (Yasli) obje;
            System.out.println(old.is_soyle());
        }
        if(obje instanceof Genc){
            Insan teen = (Genc) obje;
            System.out.println(teen.is_soyle());
        }
        if(obje instanceof Cocuk){
            Insan boy = (Cocuk) obje;
            System.out.println(boy.is_soyle());
        }
        if(obje instanceof Bebek){
            Insan bebek = (Bebek) obje;
            System.out.println(bebek.is_soyle());
        }
    }   
    public static void main(String[] args) {
        
        Yasli yasli = new Yasli("Mehmet", 70, (int) 1.80, "Emekli");
        konustur(yasli);
    
    }  
}
