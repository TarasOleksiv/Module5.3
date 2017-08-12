package ua.goit.java8.module53.flowers;

/**
 * Created by Taras on 09-08-2017.
 */
public class Chamomile extends Flower {
    private double price = 70;

    public Chamomile(){
        super.price = this.price;
    }

    public String show(){
        return "chamomile";
    }

}
