
public class BeybladeFabrikasi {
    
    public Beyblade beybladeUret(String beybladeTuru){   // Polymorphism 
        
        if(beybladeTuru.equals("Dragon")){
            return new Dragon("Takao", 200, 300, "Mavi Ejderha", "Kutsal Canavarla Konuşma");
        }
        else if(beybladeTuru.equals("Dranza")){
            return new Dranza("Kai", 400, 500, "Kırmızı Anka");
        }
        else if(beybladeTuru.equals("Drayga")){
            return new Dranza("Rei", 100, 200, "BEyaz Kaplan ");
        }       
        else if(beybladeTuru.equals("Draciel")){
            return new Dranza("Max", 20, 10, "Kamplumbaga ");
        }               
        else
            return null;
    }
    
}
