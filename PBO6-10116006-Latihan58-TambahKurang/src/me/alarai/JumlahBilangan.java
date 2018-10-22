package me.alarai;

public class JumlahBilangan extends Bilangan{

    public void tampilHasilJumlah(){
        int add = this.getX() + this.getY();
        System.out.println("Hasil penjumlahan = "+add);
    }
}
