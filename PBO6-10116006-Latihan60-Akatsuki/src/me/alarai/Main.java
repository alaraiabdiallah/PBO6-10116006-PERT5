package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program anggota akatsuki
 * */
public class Main {

    public static void main(String[] args) {
	    Member member1 = new Member();
	    member1.setNama("Itachi");
	    member1.setAsalDesa("Konohagakure");
	    member1.setUltimateJutsu("Susano'o");
	    member1.setVisi("Menjadi double agent konoha");
	    member1.setTarget("Naruto");
	    member1.menyerang();

		Member member2 = new Member();
		member2.setNama("Sasori");
		member2.setAsalDesa("Sunahagakure");
		member2.setUltimateJutsu("Metal sand bending");
		member2.setTarget("Naruto");
		member2.menyerang();
    }
}
