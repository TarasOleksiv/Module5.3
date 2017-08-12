package ua.goit.java8.module53.flowers;

/**
 * Created by Taras on 09-08-2017.
 */
public class Tulip extends Flower {
    private double price = 45;

    public Tulip(){
        super.price = this.price;
    }

    public String show(){
        return "tulip";
    }

}
