package me.alarai;

public class Member extends Akatsuki{

    private String nama,ultimateJutsu, asalDesa;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUltimateJutsu() {
        return ultimateJutsu;
    }

    public void setUltimateJutsu(String ultimateJutsu) {
        this.ultimateJutsu = ultimateJutsu;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }

    public void menyerang(){
        System.out.println("======AKATSUKI MENYERANG======");
        System.out.println("VISI : "+getVisi());
        System.out.println("MISI : "+getMisi());
        System.out.println("Target Serang : "+getTarget());
        System.out.println("Nama Penyerang : "+getNama());
        System.out.println("Asal Desa : "+getAsalDesa());
        System.out.println("Ultimate Jutsu : " + getUltimateJutsu());
        System.out.println();
    }
}
