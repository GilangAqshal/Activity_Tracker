package Array;

import java.util.Scanner;

public class Array2Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData;
        String tanya;
        String[] kodePelanggan = new String[10];
        String[] namaPelanggan = new String[10];
        String[] alamatPelanggan = new String[10];

        do {
            System.out.print("Masukkan jumlah data pelanggan: ");
            jumlahData = input.nextInt();

            for (int i = 0; i < jumlahData; i++) {
                System.out.println("\nData Ke- " + (i + 1));
                System.out.print("Kode pelanggan: ");
                kodePelanggan[i] = input.next();
                System.out.print("Nama pelanggan: ");
                namaPelanggan[i] = input.next();
                System.out.print("Alamat pelanggan: ");
                alamatPelanggan[i] = input.next();
            }

            System.out.println("\n\nDATA PELANGGAN PT. SENTOSA JAYA");
            System.out.println("JL. Sagu No.27A Kebagusan Jakarta Selatan");
            System.out.println("==============================================================");
            System.out.println("No  Kode Pelanggan  Nama Pelanggan          Alamat");
            System.out.println("==============================================================");
            for (int i = 0; i < jumlahData; i++) {
                
                System.out.printf("%-3d %-15s %-20s %-20s%n", i, kodePelanggan[i], namaPelanggan[i], alamatPelanggan[i]);
            }
            System.out.println("==============================================================");
            System.out.print("Mau input data lagi (Y/N)? ");
            tanya = input.next();
        } while (!tanya.equalsIgnoreCase("N"));

        input.close();
        System.out.println("Program selesai.");
    }
}