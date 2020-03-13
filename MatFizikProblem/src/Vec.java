
import java.util.Scanner;


public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim) {
        Scanner scan = new Scanner(System.in);
        this.isim = isim;
        System.out.println("_____"+isim+"_____");
        System.out.println("Vektörün i degerini girin : ");
        this.i=scan.nextInt();
        System.out.println("Vektörün j degerini girin : ");
        this.j=scan.nextInt();        
        System.out.println("Vektörün k degerini girin : ");
        this.k=scan.nextInt();        
    } 

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    
    
    
}
