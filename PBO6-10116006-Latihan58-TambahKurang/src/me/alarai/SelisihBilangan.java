package me.alarai;

public class SelisihBilangan extends Bilangan{

    public void tampilSelisih(){
        int min = this.getX() - this.getY();
        System.out.println("Hasil Selisih "+this.getX()+" - "+this.getY()+" = "+min);
    }
}
