package Task6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int maxWeight;
    private List<Thing> thingsInBackpack = new ArrayList<>();
    private int costBackpack;
    private int weightBackpack;

    public List<Thing> getThingsInBackpack() {
        return thingsInBackpack;
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

    public  void showBackpack() {
        System.out.println("########### Содержимое рюкзака #########");
        System.out.println("Стоимость предметов в рюкзаке: " + costBackpack);
        System.out.println("Общий вес предметов в рюкзаке: " + weightBackpack);
        System.out.println("Вещи в рюкзаке:");

        for(Thing thing : thingsInBackpack){
            System.out.println(thing);
        }
        System.out.println("########################################");
    }

    public int getCostBackpack() {
        return costBackpack;
    }

    public int getWeightBackpack() {
        return weightBackpack;
    }

    public void deleteThing(Thing thing) {
        thingsInBackpack.remove(thing);
        costBackpack += thing.getCost();
    }
    public void setThingsInBackpack(List<Thing> thingsInBackpack) {
        this.thingsInBackpack = thingsInBackpack;
    }

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

}
