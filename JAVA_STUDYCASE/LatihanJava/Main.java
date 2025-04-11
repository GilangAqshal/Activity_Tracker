package latihanjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gilan
 */
public class Main {
    public static void main(String[] args){
        // Membuat dua objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Gilang Aqshal Ilham Safatulloh";
        mhs1.nim = 15240871;

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Indira Seruni";
        mhs2.nim = 15240999;

        // Menampilkan data kedua mahasiswa
        System.out.println("Data Mahasiswa UBSI:");
        System.out.println("Nama Mahasiswa: " + mhs1.nama);
        System.out.println("NIM Mahasiswa: " + mhs1.nim);
        System.out.println();
        System.out.println("Nama Mahasiswa: " + mhs2.nama);
        System.out.println("NIM Mahasiswa: " + mhs2.nim);
    }
}