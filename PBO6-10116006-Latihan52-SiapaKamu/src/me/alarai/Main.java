package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program penurunan class manusia kepada class dosen dan mahasiswa
 * */
public class Main {

    public static void main(String[] args) {
	    Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.println();

        mhs.setNim("10116006");
        mhs.setNama("Ala Rai AbdiAllah");
        mhs.setUmur(20);
        mhs.setKelas("PBO 6");
        System.out.println("NIM MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}
