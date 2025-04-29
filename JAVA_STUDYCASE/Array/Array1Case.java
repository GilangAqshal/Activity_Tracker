package Array;

import java.io.*;

public class Array1Case {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyReader);

        int jumlahData;
        double totalBayar = 0;

        String[] jenisHelm = new String[10];
        String[] ukuranHelm = new String[10];
        String[] namaHelm = new String[10];
        int[] jumlahBeli = new int[10];
        double[] hargaHelm = new double[10];
        double[] jumlahHarga = new double[10];
        double[] pajakHelm = new double[10];
        double[] totalBayarPerItem = new double[10];

        System.out.print("Masukkan Jumlah Data : ");
        jumlahData = Integer.parseInt(input.readLine());

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nData ke - " + (i + 1));
            System.out.print("Merk Helm [KYT/BMC] : ");
            jenisHelm[i] = input.readLine();
            System.out.print("Jumlah Beli : ");
            jumlahBeli[i] = Integer.parseInt(input.readLine());
            System.out.print("Ukuran [S/M/L] : ");
            ukuranHelm[i] = input.readLine();
            System.out.println("");

            // Menentukan nama helm berdasarkan merk (opsional, bisa dihilangkan jika tidak digunakan)
            if (jenisHelm[i].equalsIgnoreCase("KYT")) {
                namaHelm[i] = "KYT";
            } else if (jenisHelm[i].equalsIgnoreCase("BMC")) {
                namaHelm[i] = "BMC";
            }

            // Menentukan harga berdasarkan merk dan ukuran
            if (jenisHelm[i].equalsIgnoreCase("KYT")) {
                if (ukuranHelm[i].equalsIgnoreCase("S")) {
                    hargaHelm[i] = 80000;
                } else if (ukuranHelm[i].equalsIgnoreCase("M")) {
                    hargaHelm[i] = 70000;
                } else {
                    hargaHelm[i] = 60000;
                }
            } else if (jenisHelm[i].equalsIgnoreCase("BMC")) {
                if (ukuranHelm[i].equalsIgnoreCase("S")) {
                    hargaHelm[i] = 90000;
                } else if (ukuranHelm[i].equalsIgnoreCase("M")) {
                    hargaHelm[i] = 85000;
                } else {
                    hargaHelm[i] = 75000;
                }
            }

            jumlahHarga[i] = hargaHelm[i] * jumlahBeli[i];
            pajakHelm[i] = jumlahHarga[i] * 0.1;
            totalBayarPerItem[i] = jumlahHarga[i] + pajakHelm[i];
            totalBayar += totalBayarPerItem[i];
        }

        System.out.println("\nTOKO HELM XXX");
        System.out.println("");

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke - " + (i + 1));
            System.out.println("Jenis Helm : " + jenisHelm[i]);
            System.out.println("Ukuran : " + ukuranHelm[i]);
            System.out.println("Harga : " + hargaHelm[i]);
            System.out.println("Jumlah Harga : " + jumlahHarga[i]);
            System.out.println("Pajak : " + pajakHelm[i]);
            System.out.println("Total Bayar : " + totalBayarPerItem[i]);
            System.out.println("");
        }

        System.out.println("Harga Semuanya adalah " + totalBayar);
    }
}