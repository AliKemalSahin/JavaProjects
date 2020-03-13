class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }
    
    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
    }
    public String konus(){
        return "Hayvan Konuşuyor."; 
    }    
    
}
class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Miyavvv "; 
    }
}
class Kopek extends Hayvan{
    

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Havvvvv ";  
    }
}

class At extends Hayvan{
    
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Aiiiii ";  
    }
}

public class Main {
    public static void konustur(Object object){
        //System.out.println(object.konus());
        
        if(object instanceof Kopek){
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        }
        else if(object instanceof Kedi){
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        }
        else if(object instanceof At){
            At at = (At) object;
            System.out.println(at.konus());    
        }
        else if(object instanceof Hayvan){
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());           
        }       
    }
    
    public static void main(String[] Args){
        
        Kedi kedi = new Kedi("Limon");
        Kopek kopek = new Kopek("Kara");
        At at = new At("Baş");
        Hayvan hayvan = new Hayvan("limon");
        
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        
//        konustur(new Kedi("Tekir"));
//        konustur(new Kopek("Kara"));
//        konustur(new At("Baş"));
        
        
//        Hayvan hayvan1 = new Kedi("Limon");
//        Hayvan hayvan2 = new Kopek("Kara");
//        Hayvan hayvan3 = new At("Baş");
//        System.out.println(hayvan1.konus());
//        System.out.println(hayvan2.konus());       
//        System.out.println(hayvan3.konus());         
        
    }
    
}
