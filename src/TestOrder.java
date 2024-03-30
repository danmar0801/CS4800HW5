import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrder {

    @Test
    public void burgerBasePriceTest() {
        FoodItem burger = new Burger();
        assertEquals(5.0, burger.getCost(), "Burger base price should be 5.0");
    }

    @Test
    public void friesBasePriceTest() {
        FoodItem fries = new Fries();
        assertEquals(2.0, fries.getCost(), "Fries base price should be 2.0");
    }

    @Test
    public void hotDogBasePriceTest() {
        FoodItem hotDog = new HotDog();
        assertEquals(3.0, hotDog.getCost(), "HotDog base price should be 3.0");
    }

    @Test
    public void cheeseAddOnTest() {
        FoodItem cheeseBurger = new Cheese(new Burger());
        assertEquals(5.5, cheeseBurger.getCost(), "Cheese Burger should cost 5.5");
    }

    @Test
    public void baconAddOnTest() {
        FoodItem baconFries = new Bacon(new Fries());
        assertEquals(2.7, baconFries.getCost(), "Bacon Fries should cost 2.7");
    }

    @Test
    public void calculateTotalTest() {
        Order order = new Order();
        order.addItem(new Burger());
        order.addItem(new Cheese(new Fries()));
        assertEquals(7.5, order.calculateTotal(), "Total cost should be 7.5");
    }

    @Test
    public void applyLoyaltyDiscountTest() {
        double total = 10.0;
        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount();
        double discountedTotal = loyaltyDiscount.applyDiscount(total, true);
        assertEquals(9.0, discountedTotal, "Discounted total should be 9.0 for loyal customers");
    }

    @Test
    public void noLoyaltyDiscountTest() {
        double total = 10.0;
        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount();
        double discountedTotal = loyaltyDiscount.applyDiscount(total, false);
        assertEquals(10.0, discountedTotal, "Discounted total should be 10.0 for non-loyal customers");
    }
}

