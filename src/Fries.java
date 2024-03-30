import java.util.ArrayList;
import java.util.List;

public class Fries implements FoodItem {
    private List<FoodItem> toppings = new ArrayList<>();
    private double basePrice = 2.0;

    public void addTopping(FoodItem topping) {
        toppings.add(topping);
    }

    @Override
    public double getCost() {
        double toppingsCost = toppings.stream().mapToDouble(FoodItem::getCost).sum();
        return basePrice + toppingsCost;
    }
}



