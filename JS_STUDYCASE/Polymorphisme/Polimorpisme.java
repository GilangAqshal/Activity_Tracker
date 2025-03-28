
package Polymorphisme;

class binatang {
    public void suara(){
     System.out.println("Binatang Bersuara");
    }
}
class kuda extends binatang {
    public void suara(){
        System.out.println("Kuda Mengkikik");
    }
}
class kucing extends binatang {
    public void suara(){
        System.out.println("Kucing Mengeong");
    }
}
class ayam extends binatang {
    public void suara(){
        System.out.println("Ayam Berkokok");
    }
}

public class Polimorpisme{
    public static void main(String[] args){
      binatang Binatang = new binatang();
      kuda KUDA = new kuda();
      kucing KUCING = new kucing();
      ayam Ayam = new ayam();
      
      Binatang.suara();
      
      Binatang = KUDA;
      Binatang.suara();
      
      Binatang = KUCING;
      Binatang.suara();
      
      Binatang = Ayam;
      Binatang.suara();
    }
}