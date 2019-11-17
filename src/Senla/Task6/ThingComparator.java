package Senla.Task6;

import java.util.Comparator;

public class ThingComparator {


    public static final Comparator<Thing> CompareByCost = new Comparator<Thing>() {
        @Override
        public int compare(Thing first, Thing second) {
            return Integer.compare(second.getCost(),first.getCost());
        }
    };
}
