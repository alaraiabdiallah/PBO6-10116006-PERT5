package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program inheritance koordinat
 * */
public class Main {

    public static void main(String[] args) {
	    WarnaKoordinat warna = new WarnaKoordinat(10,4, "Jingga");
        System.out.println("Warna Koordinat : "+warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warna.getX()+", Y : "+warna.getY());
    }
}
