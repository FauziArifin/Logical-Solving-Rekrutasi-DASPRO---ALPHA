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
public class Soal2_JamPasirBerpola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //deklare variabel
        int ukuran;
        String isi;
        
        //buat Scanner
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran pasir : ");//input ukuran jam pasir
        ukuran=in.nextInt();
        System.out.print("Masukkan isi jam pasir : ");//input isi jam pasir
        isi=in.next();
        //lakukan perulangan
        for (int i = 0; i < ukuran; i++) {
            System.out.print("|");
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k = ukuran-1; k>i; k--) {
                System.out.print(isi);
            }
            for (int l = ukuran-1; l>i; l--) {
                System.out.print(isi);
            }
            System.out.print("/");
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println("");
        }

        for (int m = 0; m < ukuran; m++) {
            System.out.print("|");
            for (int n = ukuran-1; n > m; n--) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int o = 1; o<=m; o++) {
                System.out.print(isi);
            }
            for (int p = 1; p<=m; p++) {
                System.out.print(isi);
            }
            System.out.print("\\");
            for (int i = ukuran-1; i > m; i--) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println("");
        }        
    }
    
}
