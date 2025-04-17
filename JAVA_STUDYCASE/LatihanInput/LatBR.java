
package LatihanInput;
import java.io.*;


public class LatBR {
    public static void main (String args[]) throws Exception
    {
//        membuat objek baru
        InputStreamReader keyreader = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader (keyreader);
//        membuat objek baru
    String kata1, kata2;

    System.out.print("Masukan Kata Pertama: ");
    kata1 = input.readLine();
    System.out.print("Masukan Kata Kedua: ");
    kata2 = input.readLine();
    System.out.print("Hasil input String "+ kata1+ " "+kata2);
    }
}