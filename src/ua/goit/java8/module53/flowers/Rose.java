package ua.goit.java8.module53.flowers;

/**
 * Created by Taras on 09-08-2017.
 */
public class Rose extends Flower {
    private double price = 100;

    public Rose(){
        super.price = this.price;
    }

    public String show(){
        return "rose";
    }

}
