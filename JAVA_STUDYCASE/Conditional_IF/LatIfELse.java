/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional_IF;
import java.util.Scanner;
/**
 *
 * @author gilan
 */
public class LatIfELse {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    String keterangan,nama;
    int nilai;
    
    System.out.print("Masukan Nama Siswa:");
    nama = input.nextLine();
    System.out.print("Masukan Nilai Akhir:");
    nilai = input.nextInt();
        if (nilai > 70){
            keterangan="Lulus";
        }else{
            keterangan="Gagal";
        }
    System.out.println("Hasil Akhir");
    System.out.println("========================");
    System.out.println("Nama Saya       : "+nama);
    System.out.println("Nilai Akhir     : "+nilai);
    System.out.println("Keterangan      : "+keterangan);
} 
}
