package me.alarai;

import java.sql.SQLOutput;

public class Akatsuki {

    protected String visi, misi, target;

    public Akatsuki() {
        this.visi = "Membangkitkan Juubi";
        this.misi = "Menculik jinchuriki";
    }

    public String getVisi() {
        return visi;
    }

    public void setVisi(String visi) {
        this.visi = visi;
    }

    public String getMisi() {
        return misi;
    }

    public void setMisi(String misi) {
        this.misi = misi;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void menyerang(){
        System.out.println("===AKATSUKI MENYERANG===");
        System.out.println("VISI : "+getVisi());
        System.out.println("MISI : "+getMisi());
        System.out.println("Target Serang : "+getTarget());
        System.out.println();
    }
}
