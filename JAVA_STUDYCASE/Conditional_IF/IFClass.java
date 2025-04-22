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
public class IFClass {
    public double TotBeli, potongan;
    
public void setTotalBeli(double a){
    TotBeli = a;
}
public double getPotongan(){
    if(TotBeli >= 50000){
    potongan = 0.2 * TotBeli;
    }
    return potongan;
}
public double JumlahBayar(){
    return(TotBeli-potongan);
}
}
