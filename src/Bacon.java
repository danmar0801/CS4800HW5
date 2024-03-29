public class Bacon extends FoodItemDecorator {
    public Bacon(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public double getCost() {
        return decoratedFoodItem.getCost() + 0.7;
    }
}

