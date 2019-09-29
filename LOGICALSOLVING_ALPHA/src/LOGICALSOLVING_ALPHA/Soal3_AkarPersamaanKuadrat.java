/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICALSOLVING_ALPHA;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class Soal3_AkarPersamaanKuadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //deklare variabel;
        int a = 0, b = 0, c = 0;
        
        Scanner input = new Scanner(System.in); //membuat Scanner dengan objek input
        
        //input String
        System.out.print("Persamaan : "); //ax+b=c
        String str =  input.nextLine();
        
        //Membuat Pattern untuk mengidentifikasi operator dan variabel
        Pattern p = Pattern.compile("^s?(x)\\s?\\+?\\s?(-?\\d+)\\s?=\\s?(-?\\d+)$");     
        Pattern p2 = Pattern.compile("^(-?\\d+)\\s?(x)\\s?=\\s?(-?\\d+)$");        
        Pattern p3 = Pattern.compile("^(-?\\d+)\\s?(x)\\s?\\+?\\s?(-?\\d+)\\s?=\\s?(-?\\d+)$");
        
        //Menentukan mana yg cocok dengan String yang diinput
        Matcher m = p.matcher(str); 
        Matcher m2 = p2.matcher(str);        
        Matcher m3 = p3.matcher(str);   
        
        //Jika String dimulai dengan karakter x;
        if(str.startsWith("x")){
            if(m.find()){
                a = 1;
                b = Integer.valueOf(m.group(2));
                c = Integer.valueOf(m.group(3)); 
            }                
        }else if(str.contains("x=")){   //Jika String mengandung karakter x=
            if (m2.find()) {
                a = Integer.valueOf(m2.group(1));
                b = 0;
                c = Integer.valueOf(m2.group(3));     
            }
        }else if(str.contains("x+") | str.contains("x-")){ //jika String mengandung karakter x+ atau x-
            if (m3.find()) {
                a = Integer.valueOf(m3.group(1));
                b = Integer.valueOf(m3.group(3));
                c = Integer.valueOf(m3.group(4));   
            }     
        }   
        //Eksekusi
        //Jika a = 0 , maka format tidak sesuai, karena tidak ada di pattern
        if(a == 0){
            System.out.println("Format Penulisan Salah");
        }else{ //Jika format sesuai, maka akan dieksekusi
            Double x = new Double(c - b) / a;
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("c = "+c);
            
            if(x.toString().contains(".")){
                System.out.println((c-b)+"/"+a);
            }else{
                System.out.println("x = "+x);
            }    
            
        }         
    }
    
}
