public abstract class FoodItemDecorator implements FoodItem {
    protected FoodItem decoratedFoodItem;

    public FoodItemDecorator(FoodItem decoratedFoodItem) {
        this.decoratedFoodItem = decoratedFoodItem;
    }
}

