/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanInput;
import java.util.Scanner;
/**
 *
 * @author gilan
 */
public class ClassScanner {
   public String nama;
   public double n1;
   public int n2,n3;
   Scanner input = new Scanner(System.in);
   
   public String getnama(){
       return nama;
   }
   
   public void inputScanner(){
       System.out.print("Masukan Nama Anda: ");
        nama = input.nextLine();
        System.out.print("Masukan Nilai 1: ");
        n1 = input.nextDouble();
        System.out.print("Masukan Nilai 2 : ");
        n2 = input.nextInt();
   }
   
   public double rata(){
       return((n1 + n2)/2);
   }
}
