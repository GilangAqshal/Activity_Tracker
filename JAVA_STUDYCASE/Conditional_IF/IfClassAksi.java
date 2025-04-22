/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional_IF;
import java.util.Scanner;

public class IfClassAksi {
    public static void main(String[] args){
        double tot_beli;
        Scanner input = new Scanner (System.in);
        IFClass fungsiif = new IFClass();
        
        System.out.print("Total Pembelian Rp.");
        fungsiif.TotBeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan Rp."+fungsiif.getPotongan());
        System.out.println("Jumlah yang harus dibayarkan Rp."+fungsiif.JumlahBayar());
    }
}
