/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author gilan
 */
public class LatArray1 {
    public static void main(String[] args){
        int i;
        int [] nil_akhir;
        
        nil_akhir = new int[6];
        Scanner input = new Scanner(System.in);
            for(i=0; i<6; i++){
                System.out.println("Masukan array ke "+ i +" = ");
                nil_akhir[i] = input.nextInt();
            }
            System.out.println("\n\n Data yang diinputkan Ke Elemen Array \n");
            for(i=0; i<6; i++){
                System.out.println("Nilai akhir Index "+i);
                System.out.println(" = "+nil_akhir);
            }
    }
}
