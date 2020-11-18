/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan55.handphone;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program jenis handphone
 */
public class PBOIF210119043Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStrore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStrore() + "\n");
        
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB() + "\n");
        
        WindowsPhone wP = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wP.setWpKeyStore("UUUQIJWORJ");
        wP.displayProduct();
        System.out.println("Wp Key Store : " + wP.getWpKeyStore());
    }
    
}
