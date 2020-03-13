
public class Abone {
    
    public String isim;
    public int bakiye;
    public String sehir;
    
    public void gazKullan(int miktar){
        if(this.bakiye-miktar<0){
            System.out.println("Yeterli Bakiye Yok");
        }
        else{
            this.bakiye-=miktar;
            if(this.bakiye <=0)
                System.out.println("Bakiyeniz Bitmiştir...");
            else
                System.out.println("Yeni Bakiye --> "+bakiye);
        }
    }
    
    public void bakiyeOgren(){
        System.out.println("Bakiye --> "+bakiye);
    }
    
    
}
