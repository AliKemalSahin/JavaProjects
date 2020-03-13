
public class Main {
    public static void main(String[] args) {
        
        Matematik.Factorial factorial = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();        
        Matematik.Alan.DaireAlan alan = new Matematik().new Alan().new DaireAlan();       

        factorial.faktoriyel();
        if(asal.asal_mi(23)== false){
             System.out.println("Asal Degil.");
        }
        else
             System.out.println("Asal");
        alan.daire_alan(4);

        
        
    }
}
