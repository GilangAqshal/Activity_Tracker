
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5case;
import java.io.*;

/**
 *
 * @author gilang
 */

class KasusArray {
    public static void main(String[] args) throws IOException {
        InputStreamReader Keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Keyreader);
        int i, j;
        double total=0;
        
        String [] jenis, ukuran,nama;
        int [] jumbel;
        double [] harga, jumhar, pajak, tobar;
        jenis = new String [10];
        ukuran = new String [10];
        jumbel = new int [10];
        harga = new double [10];
        jumhar = new double [10];
        pajak = new double [10];
        tobar = new double [10];
        nama=new String[10];
        
        System.out.print("Masukkan Jumlah Data : ");j=Integer.parseInt(input.readLine());
        for (i=1;i<=j;i++){
            System.out.println("Data ke - " + i);
            System.out.print("Merk Helm [KYT/BMC] : ");jenis[i]=input.readLine();
            System.out.print("Jumlah Beli :");jumbel[i]=Integer.parseInt(input.readLine());
            System.out.print("Ukuran [S/M/L] : ");ukuran[i]=input.readLine();
            System.out.println("");
            
        
            if (jenis[i].equalsIgnoreCase("KYT")) {
                        if (ukuran[i].equalsIgnoreCase("S")) {
                            harga[i] = 80000;
                        } else if (ukuran[i].equalsIgnoreCase("M")) {
                            harga[i] = 70000;
                        } else {
                            harga[i] = 60000;
                        }
                    } else if (jenis[i].equalsIgnoreCase("BMC")) {
                        if (ukuran[i].equalsIgnoreCase("S")) {
                            harga[i] = 90000;
                        } else if (ukuran[i].equalsIgnoreCase("M")) {
                            harga[i] = 85000;
                        } else {
                            harga[i] = 75000;
            }

            jumhar[i]=harga[i]*jumbel[i];
            pajak[i]=jumhar[i]*0.1;
            tobar[i]=jumhar[i]+pajak[i];
            total=total+tobar[i];
            
            System.out.println("TOKO HELM LANGS");
            System.out.println(" ");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                System.out.println("Data ke - " + i);
                System.out.println("Jenis Helm : " + jenis[i]);
                System.out.println("Ukuran : " + ukuran[i]);
                System.out.println("Harga : " + harga[i]);
                System.out.println("Jumlah Harga : " + jumhar[i]);
                System.out.println("Pajak : " + pajak[i]);
                System.out.println("Total Bayar : " + tobar[i]);
                System.out.println("");
                }
                System.out.println("Harga Semuanya adalah " + total);
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
         }
    }   
}