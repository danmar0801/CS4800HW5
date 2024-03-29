import java.util.ArrayList;
import java.util.List;

public class Fries implements FoodItem {
    private List<FoodItemDecorator> toppings = new ArrayList<>();
    private double basePrice = 2.0;

    public void addTopping(FoodItemDecorator topping) {
        toppings.add(topping);
    }

    @Override
    public double getCost() {
        double toppingsCost = toppings.stream().mapToDouble(FoodItemDecorator::getCost).sum();
        return basePrice + toppingsCost;
    }
}


