
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi={1,2,3,4,5,6};        
        String[] string_dizi={"Java","Phyton","C++","Php"};
        
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Ahmet")};
        
        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
        yazdir_char.yazdir(char_dizi);
        System.out.println("___________________________");
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
        yazdir_string.yazdir(string_dizi);
        System.out.println("___________________________");
        YazdirmaSinifi<Integer> yazdir_int = new YazdirmaSinifi<Integer>();
        yazdir_int.yazdir(integer_dizi);
        System.out.println("___________________________");
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();
        yazdir_ogrenci.yazdir(ogrenci_dizi);
        
    }
}
