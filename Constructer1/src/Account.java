
public class Account {
    
    private String hesapNO;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;
    
    
    public Account(){
        //System.out.println("Kendi Oluşturduğumuz Constructer");
        this("bilgi yok", 0.0, "bilgi yok", "bilgi yok", "bilgi yok");
    }
    public Account(String isim,String email,String telefonNo){
        this("bilgi yok",0.0,isim,email,telefonNo);
        
    }
    public Account(String hesapNO,double bakiye,String isim,String email,String telefonNo){
        this.hesapNO=hesapNO;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
    }
    public void bilgileriGoster(){
        System.out.println("Hesap No : "+this.hesapNO);
        System.out.println("Bakiye : "+this.bakiye);
        System.out.println("İsim : "+this.isim);
        System.out.println("Email : "+this.email);
        System.out.println("Tel No : "+this.telefonNo);
    }
    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.println("Yeni Bakiye --> "+bakiye);
    }
    public void paraCek(double miktar){
        if( bakiye < miktar || miktar > 1500 ){
            System.out.println("Bakiyenizde Yeterli Para Yok --> "+bakiye);
        }
        else
        {
            bakiye-=miktar;
            System.out.println("Yeni Bakiye --> "+bakiye);
        }
    }
    

    /**
     * @return the hesapNO
     */
    public String getHesapNO() {
        return hesapNO;
    }

    /**
     * @param hesapNO the hesapNO to set
     */
    public void setHesapNO(String hesapNO) {
        this.hesapNO = hesapNO;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
    
}
