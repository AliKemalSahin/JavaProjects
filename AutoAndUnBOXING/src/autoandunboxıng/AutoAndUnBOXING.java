/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoandunboxıng;

/**
 *
 * @author AliKemalSahin
 */
public class AutoAndUnBOXING {

    public static void main(String[] args) {
        String a="AliKemal";
        String b=new String("AliKemalmm");
        
        System.out.println(a.charAt(0));
        
        
        for(int i=0; i<b.length();i++){
            System.out.print(b.charAt(i));
        }
        
        
        System.out.println(b.lastIndexOf('m'));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        
        
        String a1="asdasd";
        String a2="asdasd";
        
        if(a1==a2)
            System.out.println("fuckkkk");
        if(a1.equals(a2))
            System.out.println("fuckkkkkkkkkkkkkkk");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
