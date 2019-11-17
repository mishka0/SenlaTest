package Senla.Task6;
/*
    Имеется набор вещей, которые необходимо поместить в рюкзак.
    Рюкзак обладает заданной грузоподъемностью.
    Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
    Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */
import Senla.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Thing> things = new ArrayList<>();
        Reader reader = new Reader();

        System.out.println("Введите количество вещей: ");
        int numberOfThings = reader.readInt();

        System.out.println("Введите грузоподъемность рюкзака: ");
        Backpack backpack = new Backpack(reader.readInt());

        Random random = new Random();

        for (int i = 0; i < numberOfThings; i++) {
            Thing thing = new Thing(random.nextInt(15) + 1, random.nextInt(100) + 1);
            things.add(thing);
        }

        things.sort(ThingComparator.CompareByCost);

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
    }
}

