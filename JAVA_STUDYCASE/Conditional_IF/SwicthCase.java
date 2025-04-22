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
public class SwicthCase {
    public static void main(String[] args){
        int kd;
        String nb="";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kode barang[1..3]:");
        kd=input.nextInt();
        
        switch(kd){
            case 1:
                nb="Alat Olahraga";
                break;
            case 2:
                nb="Alat Elektronik";
                break;
            case 3:
                nb="Alat-alat Musik";
                break;
            default:
                nb="Anda Salah COde";
                break;
        }
        System.out.print("\nNamaBarang: "+nb);
    }
}
