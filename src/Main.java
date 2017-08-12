import ua.goit.java8.module53.flowers.Flower;
import ua.goit.java8.module53.flowers.FlowerStore;
import ua.goit.java8.module53.flowers.FlowersLoader;


/**
 * Created by Taras on 09-08-2017.
 */
public class Main extends FlowersLoader {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();

        Flower[] flowers = flowerStore.sell(3,5,7);
        System.out.println("Selling flowers with the method \"sell\":");
        showFlowers(flowers);
        System.out.println();
        System.out.println("Cash in Kassa: " + flowerStore.getCash());
        System.out.println();
        save("files/flowers.txt",flowers);

        Flower[] flowerSequence = flowerStore.sellSequence(3,5,7);
        System.out.println("Selling flowers with the method \"sellSequence\":");
        showFlowers(flowerSequence);
        System.out.println();
        System.out.println("Cash in Kassa: " + flowerStore.getCash());
        System.out.println();
        save("files/flowers.txt",flowerSequence);

        Flower[] flowersRead = load("files/flowers.txt");
        System.out.println("Reading flowers from the file");
        showFlowers(flowersRead);
    }

    public static void showFlowers(Flower[] flowers){
        for (int i = 0; i < flowers.length - 1; i++){
            System.out.print(flowers[i].show() + ",");
        }
        System.out.print(flowers[flowers.length-1].show());
    }
}
