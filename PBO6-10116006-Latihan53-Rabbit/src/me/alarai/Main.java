package me.alarai;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program inheritence Animal
 * */
public class Main {

    public static void main(String[] args) {
	    Rabbit rabbit = new Rabbit("Peter",false,"grass",4,"grey");

        System.out.println("Hello, His name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian ? "+ rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" eats "+ rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+ rabbit.getNoOfLegs()+" legs");
        System.out.println(rabbit.getName()+" color is "+ rabbit.getColor());
    }
}
