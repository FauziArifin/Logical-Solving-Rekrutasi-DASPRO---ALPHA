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
public class Soal1_FactorPersekutuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi Variabel
        int n1,n2;
        
        //buat Scanner
        Scanner in = new Scanner(System.in);
        
        //Input nilai
        System.out.println("Input Faktor Persekutuan 2 Bilangan");
        System.out.print("Angka pertama : ");
        n1=in.nextInt();
        in.nextLine();
        System.out.print("Angka kedua   : ");
        n2=in.nextInt();
        in.nextLine();
        
        //Hitung bilangan ke 1
        System.out.print("Faktor dari "+n1+" : ");
        for (int i = 1; i <= n1; i++) {
            if (n1%i==0) {//Dihitung n1 dibagi dengan i 
                System.out.print(i+" ");
            }
        }
        //Hitung bilangan ke-2
        System.out.print("\nFaktor dari "+n2+" : ");
        for (int j = 1; j <= n2; j++) {
            if (n2%j==0) {//n dibagi dengan j
                System.out.print(j+" ");
            }
        }
        //Hitung bilangan yang sama 
        System.out.print("\nFaktor persekutuan bilangan "+n1+" dan "+n2+" : ");
        for (int k = 1; k <= n1; k++) {
            if (n1%k==0&&n2%k==0) {
                System.out.print(k+" ");
            }
        }        
    }
    
}
