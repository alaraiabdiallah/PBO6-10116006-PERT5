package me.alarai;

public class Bicycle extends Vehicle {

    private int myGearCount;

    public Bicycle() {
        super();
        System.out.println("Bicycle");
        this.setMyBrand("Trek Bike");
        this.setMyModel("7.4FX");
        this.setMyGearCount(23);
        System.out.println("Brand : "+this.getMyBrand());
        System.out.println("Model : "+this.getMyModel());
        System.out.println("Jumlah Gear "+getMyGearCount());
        System.out.println();
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
