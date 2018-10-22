package me.alarai;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program display produk handphone dari berbagai vendor
 * */

public class Main {

    public static void main(String[] args) {
        Android samsung = new Android("Samsung","Android", "Grand", 3000000);
        samsung.setKeyStore("234ibdf3840fo");
        samsung.displayProduct();
        System.out.println("Android Key Store : "+samsung.getKeyStore());

        System.out.println();

        BlackBerry bb = new BlackBerry("BlackB","RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());

        System.out.println();

        WindowsPhone wp = new WindowsPhone("Nokia","Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
    }
}
