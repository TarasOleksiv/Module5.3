package ua.goit.java8.module53.flowers;

import java.io.FileWriter;

/**
 * Created by Taras on 11-08-2017.
 */
public abstract class FlowersSaver {
    public static void save(String fileName, Flower[] flowers) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < flowers.length - 1; i++){
                writer.write(flowers[i].show() + ",");
            }
            writer.write(flowers[flowers.length-1].show() + "\n");
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
