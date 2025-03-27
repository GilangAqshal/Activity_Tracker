/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author gilan
 */
 class SepedaGunung extends sepeda {
    int setSadel;
    public void setSadel(int nilaiSadel){
        setSadel = nilaiSadel;
        
        System.out.println("Tinggi Sadel: "+setSadel);
    }
}
