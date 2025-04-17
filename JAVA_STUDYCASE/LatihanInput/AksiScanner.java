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
public class AksiScanner {
    public static void main(String args[]){
//    membuat objek baru
    
    ClassScanner scan = new ClassScanner();
        scan.inputScanner();
    System.out.println("\nNama Anda : "+scan.getnama());
    System.out.println("\nNilai Anda : "+scan.rata());
    }
}
