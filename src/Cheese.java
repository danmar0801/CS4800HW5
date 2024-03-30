public class Cheese implements FoodItem {
    public static final double CHEESE_COST = 0.5;

    @Override
    public double getCost() {
        return CHEESE_COST;
    }
}

