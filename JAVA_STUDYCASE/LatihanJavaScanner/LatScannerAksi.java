/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanJavaScanner;
import LatihanInput.ClassScanner;
import java.util.Scanner;

public class LatScannerAksi {
     public static void main(String args[]){
//    membuat objek baru
    
    LatScanner scan = new LatScanner();
        scan.inputScanner();
    System.out.println("\nPROGRAM NILAI MAHASISWA");
    System.out.println("-----------------------");
    System.out.println("NIM : "+scan.getnim());
    System.out.println("Nama : "+scan.getnama());
    System.out.println("Nilai Absen : "+scan.getAbsen()); 
    System.out.println("Nilai Tugas : "+scan.getTugas()); 
    System.out.println("Nilai UTS : "+scan.getUts());   
    System.out.println("Nilai UAS : "+scan.getUas());   
    System.out.println("Rata-rata Nilai : "+scan.rata());
    }
}
