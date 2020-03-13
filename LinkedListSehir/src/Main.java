
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    public static void islemleri_bastir(){
        System.out.println("0 - İşlemleri Görüntüle\n"
                + "1 - Bir Sonraki Şehre git\n"
                + "2 - Bir Önceki Şehre git\n"
                + "3 - Uygulamadan Çık");
    }
    
    public static void sehirleri_turla(LinkedList<String> sehirler ){
        Scanner scan = new Scanner(System.in);
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;
        islemleri_bastir();
        
        if(!iterator.hasNext()){ //  listemiz boş mu?(boşsa true)           
            System.out.println("Herhangi Bir Şehir Bulunmuyor...");         
        }
        boolean cikis = false;
        boolean ileri = true;
        while(!cikis){
            System.out.println("Bir İşlem Seçiniz : ");
            islem = scan.nextInt();
            
            switch(islem){
                case 0 : islemleri_bastir();
                         break;
                case 1 : 
                        if(!ileri){
                            if(iterator.hasNext()){
                                iterator.next();
                            }
                        
                            ileri = true;
                        }
                        
                        if(iterator.hasNext()){
                            System.out.println(iterator.next()); 
                        }
                            
                         else
                            System.out.println("İleride Kayıtlı Bir Şehir Yok");
                         break;
                    
                case 2 : 
                        if(ileri){
                            if(iterator.hasPrevious()){
                                iterator.previous();
                            }
                            ileri = false;
                        }
                         if(iterator.hasPrevious())
                            System.out.println(iterator.previous());  
                         else
                         {
                             System.out.println("Geride Kayıtlı Bir Şehir Yok");
                             ileri = true;
                         }
                         break;
                    
                case 3 : cikis = true;
                         break;
            }
            
            
            
            
        }
        
        
    }
    
    public static void main(String[] Args){
        LinkedList<String> sehirler = new LinkedList<String>();
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");
        sehirler.add("Karabük");
        sehirler.add("Mersin");
        sehirler.add("Gümüshane");
        
        sehirleri_turla(sehirler);
        
        
        
    }
    
}
