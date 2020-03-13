
public class Main {
    public static void main(String[] args) {
        
        IOgrenci ogr1 = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders Çalışıyorum.");
            }

            @Override
            public void derse_gir() {
                System.out.println("Ders Giriyorum.");
            }
        };
        
        ogr1.ders_calis();
        ogr1.derse_gir();
        
        AOgrenci ogr2 = new AOgrenci("Ali",23) {
            @Override
            void kayit_yaptir() {
                System.out.println("Kayıt yapıldı.");
            }
        };
        
        ogr2.kayit_yaptir();
        ogr2.selamla();
        System.out.println(ogr2.getIsim()+" "+ogr2.getNumara());
        
        
    }
    public static abstract class AOgrenci{
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        } 
        
        abstract void kayit_yaptir();
        public void selamla(){
            System.out.println("Selamlar");
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        
        
    }
    public interface IOgrenci{
        void ders_calis();
        void derse_gir();
    }
}
