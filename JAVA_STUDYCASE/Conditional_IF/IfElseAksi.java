/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional_IF;

/**
 *
 * @author gilan
 */

public class IfElseAksi {
    public static void main(String[] args){
        IfElseClass ifclass=new IfElseClass();
        
        ifclass.setInputData();
        ifclass.getKeterangan();
            System.out.print("Hasil Akhir");
            System.out.print("\n=================");
            System.out.print("\nNama Siswa: "+ifclass.nama);
            System.out.print("\nNilai Akhir: "+ifclass.nilaiAkhir);
            System.out.print("\nNilai Akhir: "+ifclass.getKeterangan());
            System.out.print("\n==================");
    }
}
