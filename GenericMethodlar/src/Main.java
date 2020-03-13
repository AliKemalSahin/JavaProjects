
import java.util.ArrayList;
import java.util.Scanner;


public class Main {      
//    public static <E> void yazdir(E[] dizi){
//        for(E e : dizi){
//            System.out.println(e);
//        }
//    }
    public static <E extends Aday> E birinci(E e1,E e2,E e3){
        if(e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla()>e3.puanHesapla()){
            return e1;
        }
            
        else if(e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla()>e3.puanHesapla()){
            return e2;  
        }
                  
        else if(e3.puanHesapla() > e1.puanHesapla() && e3.puanHesapla()>e2.puanHesapla()){
            return e3;
        }
        else
            return e1; // hepsi eşitse
                    
        
    }
    public static void main(String[] args) {
        
        System.out.println("YGS ve LYS 1.ci Bulma..");
        Scanner scan = new Scanner(System.in);
        String islemler = "1-Eşit Ağırlık Birincisi\n"
                + "2-Sayısal Birincisi"
                + "3-Cıkıs : q";
        System.out.println("___________________________");
        while (true) {    
            
                System.out.println("Birinci Öğrenci İsmi : ");
                String isim1 = scan.nextLine();
                System.out.println("Netleri Girin : (Türkçe Matematik Edebiyat Fizik)");
                int turkce1 = scan.nextInt();
                int matematik1 = scan.nextInt();
                int edebiyat1 = scan.nextInt();
                int fizik1 = scan.nextInt();
                scan.nextLine();
                
                System.out.println("İkinci Öğrenci İsmi : ");
                String isim2 = scan.nextLine();
                System.out.println("Netleri Girin : (Türkçe Matematik Edebiyat Fizik)");
                int turkce2 = scan.nextInt();
                int matematik2 = scan.nextInt();
                int edebiyat2 = scan.nextInt();
                int fizik2 = scan.nextInt();            
                scan.nextLine();
                
                System.out.println("Üçüncü Öğrenci İsmi : ");
                String isim3 = scan.nextLine();
                System.out.println("Netleri Girin : (Türkçe Matematik Edebiyat Fizik)");
                int turkce3 = scan.nextInt();
                int matematik3 = scan.nextInt();
                int edebiyat3 = scan.nextInt();
                int fizik3 = scan.nextInt(); 
                scan.nextLine();
                
            System.out.println("İşlem Giriniz : ");
            String islem = scan.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor.");
                break;
            }
            else if(islem.equals("1")){
                EsitAgirlik ogr1 = new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogr2 = new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogr3 = new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                EsitAgirlik birinci = birinci(ogr1, ogr2, ogr3);
                System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + birinci.getIsim());
            }
            else if(islem.equals("2")){
                Sayisal ogr1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogr2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogr3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                Sayisal birinci = birinci(ogr1, ogr2, ogr3);
                System.out.println("Birinci Sayisal Öğrencisi : " + birinci.getIsim());  
            }
            
            
            
        }
        
        
        
//////        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
//////        Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);
//////       
//////        Sayisal birinci = birinci(sayisal1, sayisal2);
//////        
//////        EsitAgirlik esit1 = new EsitAgirlik(30, 20, 40, 2);
//////        EsitAgirlik esit2 = new EsitAgirlik(40, 10, 50, 0);
//////        
//////        EsitAgirlik birinci2 = birinci(esit1, esit2);
//////        
//////        
//////        System.out.println("Sayısalda 1.ci Öğrencinin Puanı : "+birinci.puanHesapla());
//////        System.out.println("Eşit Ağırlıkta 1.ci Öğrencinin Puanı : "+birinci2.puanHesapla());
//        
//        Character[] char_dizi = {'J','A','V','A'};
//        Integer[] integer_dizi={1,2,3,4,5,6};        
//        String[] string_dizi={"Java","Phyton","C++","Php"};
//        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Ahmet")};
//        
//        yazdir(char_dizi);
//        yazdir(integer_dizi);
//        yazdir(string_dizi);
//        yazdir(ogrenci_dizi);
        
 
    }
}
