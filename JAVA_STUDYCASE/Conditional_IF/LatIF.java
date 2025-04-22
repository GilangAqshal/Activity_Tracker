/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional_IF;
import java.util.*;
/**
 *
 * @author gilan
 */
public class LatIF {
    public static void main (String[] args){
        double tot_beli,potongan = 0, jum_bayar = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Total pembelian Rp. ");
        tot_beli = input.nextDouble();
            if (tot_beli >= 50000)
            potongan = 0.2 * tot_beli;
        System.out.println("Besarnya Potongan Rp. " + potongan);
        jum_bayar = tot_beli - potongan;
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jum_bayar);
                
      
    }
}
