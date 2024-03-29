public class Cheese extends FoodItemDecorator {
    public Cheese(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public double getCost() {
        return decoratedFoodItem.getCost() + 0.5;
    }
}

