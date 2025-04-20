
package LatihanJavaScanner;
import java.util.Scanner;

public class LatScanner {
        String nim,nama;
        int absen,tugas,uts,uas;
        Scanner input=new Scanner(System.in);
    
    public String getnim(){
        return nim;
    }
    public String getnama(){
       return nama;
   } 
   public int getAbsen(){
        return absen;
    }

    public int getTugas(){
        return tugas;
    }

    public int getUts(){
        return uts;
    }

    public int getUas(){
        return uas;
    }

    
    public void inputScanner(){
        System.out.print("INPUT\n");
        System.out.print("Masukan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukan Nilai Absen : ");
        absen = input.nextInt();
        System.out.print("Masukan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukan Nilai UTS : ");
        uts = input.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        uas = input.nextInt();
    }
    public double rata(){
        return ((0.10 * absen) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas));
    }
}
