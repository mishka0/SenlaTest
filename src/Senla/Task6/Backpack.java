package Senla.Task6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int maxWeight;
    private List<Thing> thingsInBackpack = new ArrayList<>();
    private int costBackpack;
    private int weightBackpack;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() <= (maxWeight - weightBackpack)) {
            thingsInBackpack.add(thing);
            costBackpack += thing.getCost();
            weightBackpack += thing.getWeight();
            System.out.println("Вещь добавлена в рюкзак!");

        } else {
            System.out.println("Тяжелая вещь");
        }
    }

    public void showBackpack() {
        System.out.println("########### Содержимое рюкзака #########");
        System.out.println("Стоимость предметов в рюкзаке: " + costBackpack);
        System.out.println("Общий вес предметов в рюкзаке: " + weightBackpack);
        System.out.println("Вещи в рюкзаке:");

        for (Thing thing : thingsInBackpack) {
            System.out.println(thing);
        }

        System.out.println("########################################");
    }
}
