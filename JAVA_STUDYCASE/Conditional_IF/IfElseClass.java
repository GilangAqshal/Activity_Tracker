/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional_IF;
import java.util.Scanner;
public class IfElseClass {
    public String nama, ket;
    public int nilaiAkhir;
    Scanner input = new Scanner(System.in);
    
    public void setInputData(){
        System.out.print("Masukan Nama siswa: ");
        nama = input.nextLine();
        System.out.print("Masukan Niiai siswa: ");
        nilaiAkhir = input.nextInt();
    }
    
    public String getKeterangan(){
        if(nilaiAkhir > 70){
            ket= "lulus";
    }else{
          ket="gagal";  
        }
        return ket;
    }
}
