
public class Daire extends Sekil{
    private int r;
    public Daire(String isim,int r) {
        super(isim);
        this.r=r;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+"'nin alanı : "+(Math.PI)*r*r);
    }
    
}
