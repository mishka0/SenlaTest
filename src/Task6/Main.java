package Task6;
/*
    Имеется набор вещей, которые необходимо поместить в рюкзак.
    Рюкзак обладает заданной грузоподъемностью.
    Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
    Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int numberOfThings;
        ArrayList<Thing> things = new ArrayList<>();

        System.out.println("Введите количество вещей: ");
        numberOfThings = InputInt.inputInt();

        System.out.println("Введите грузоподъемность рюкзака: ");
        Backpack backpack = new Backpack(InputInt.inputInt());

        Random random = new Random();

        for (int i = 0; i < numberOfThings; i++) {
            Thing thing = new Thing(random.nextInt(15) + 1, random.nextInt(100) + 1);
            things.add(thing);
        }

        things.sort(Thing.CompareByCost);

        System.out.println("########### Список вещей ###############");
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
        System.out.println("########################################");
        System.out.println();


        System.out.println("##### Добавляем вещи в рюкзак ##########");
        for(Thing thing : things)
        {
            backpack.addThing(thing);
        }
        System.out.println("########################################");
        System.out.println();


        backpack.showBackpack();





        // backpack.add
    }
}

