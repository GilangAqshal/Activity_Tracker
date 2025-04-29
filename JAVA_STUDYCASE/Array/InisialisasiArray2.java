/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author gilan
 */
public class InisialisasiArray2 {
    public static void main(String[] args){
     int i, j;
     int [][] nil_akhir = {{250, 159, 209}, {100, 125, 150}, {210, 125, 156}};
    
    System.out.println("Data yang Diinput keElemen Array \n");
//    menampilkan data dari elemen array
    for(i=0; i<3; i++){
        for(j=0; j<3; j++){
            System.out.println("Nilai AKhir Indeks ["+i+"] ["+j+"] " );
            System.out.println(" = "+nil_akhir[i][j]);
        }
        }
    }
    
}



