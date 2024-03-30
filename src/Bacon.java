public class Bacon implements FoodItem {
    public static final double BACON_COST = 0.7;

    @Override
    public double getCost() {
        return BACON_COST;
    }
}

