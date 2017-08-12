package ua.goit.java8.module53.flowers;

/**
 * Created by Taras on 09-08-2017.
 */
public class Flower {
    protected double price = 0;

    public Flower(){
    }

    public String show(){
        return "flower";
    }

    public double getPrice(){
        return price;
    }
}
