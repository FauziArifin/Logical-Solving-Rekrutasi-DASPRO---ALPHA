/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICALSOLVING_ALPHA;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Soal4_TheBestSecond {
    public static void main(String[] args) {
        // TODO code application logic here
        int dat,maks;
        
        //buat Scanner
        Scanner in = new Scanner(System.in);
        
        System.out.println("Aplikasi menentukan Best Second");
        System.out.print("Total Data : ");
        dat=in.nextInt();
        System.out.println("");
        
        int a[] = new int[dat];
        int terbesar = 0;
        int terbesar2 = 0;
        //input data
        for (int i = 0; i < dat; i++) {
            System.out.print("Angka ke-"+(i+1)+" : ");
            a[i]=in.nextInt();
        }
        //Mencari nilai terbesar
        for (int j = 0; j < dat; j++) {
            if (terbesar<a[j]) {//Mengecek apakah terbesar > dari a[j]
                terbesar=a[j];//Menginputkan a[j] ke terbesar
                //Mencari nilai terbesar ke 2
                for (int k = 0; k < dat; k++) {
                    if (a[k]>terbesar2&&a[k]<terbesar) {
                        terbesar2=a[k];
                    }
                }
            }
        }
        //Print nilai 
        System.out.println("\nBest Second : "+terbesar2);        
    }
    
}
