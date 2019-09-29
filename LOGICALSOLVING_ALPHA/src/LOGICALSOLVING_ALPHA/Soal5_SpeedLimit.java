/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICALSOLVING_ALPHA;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Soal5_SpeedLimit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        //variabel
        double speed;
        int point;
        
        //buat Scanner
        Scanner in = new Scanner(System.in);
        
        //Jalankan porgram
        System.out.println("===========Speed Limit===========");
        System.out.print("Speed : "); //input speed
        speed=in.nextDouble();
        
        if (speed<=70) {
            System.out.println("Ok."); //Jika kurang dari atau sama dengan 70
        }else if (speed>70&&speed<=130) { 
            point=(int)((speed-70)/5);
            System.out.println("Point : "+point);//Untuk point maks 12
        }else{
            System.out.println("License Suspended");//poin lebih dari 12
        }
    }
    
}
