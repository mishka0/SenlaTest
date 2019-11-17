package Task6;

import java.util.Comparator;

public class Thing {
    private int weight;
    private int cost;

    public Thing(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return ("Вес: " + weight + " Стоимость: " + cost);
    }

    public static final Comparator<Thing> CompareByCost = new Comparator<Thing>() {
        @Override
        public int compare(Thing first, Thing second) {
            return Integer.compare(second.getCost(),first.getCost());
        }
    };
}
