package me.alarai;

public class Skateboard extends Vehicle {

    private double myBoardLength;

    public Skateboard() {
        super();
        System.out.println("SkateBoard");
        this.setMyBrand("Ally Skate");
        this.setMyModel("Rocket");
        this.setMyBoardLength(54.5);
        System.out.println("Brand : "+this.getMyBrand());
        System.out.println("Model : "+this.getMyModel());
        System.out.println("Panjang Board: "+getMyBoardLength());
        System.out.println();
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
}
