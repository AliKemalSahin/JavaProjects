
public class Hesap {
    
    private String isim;
    private String sifre;
    private int bakiye;
    
    public Hesap(String isim,String sifre,int bakiye){
        this.isim=isim;
        this.sifre=sifre;
        this.bakiye=bakiye;
    }
   
    public void paraYatir(int tutar){
        bakiye+=tutar;
        System.out.println("Yeni Bakiye --> "+bakiye);             
    }
    public void paraCek(int tutar){
        bakiye-=tutar;
        System.out.println("Yeni Bakiye --> "+bakiye);   
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the sifre
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
    
    
    
    
}
