import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrder {

    @Test
    public void burgerBasePriceTest() {
        Burger burger = new Burger();
        assertEquals(5.0, burger.getCost(), "Burger base price should be 5.0");
    }

    @Test
    public void friesBasePriceTest() {
        Fries fries = new Fries();
        assertEquals(2.0, fries.getCost(), "Fries base price should be 2.0");
    }

    @Test
    public void hotDogBasePriceTest() {
        HotDog hotDog = new HotDog();
        assertEquals(3.0, hotDog.getCost(), "HotDog base price should be 3.0");
    }

    @Test
    public void burgerWithToppingsTest() {
        Burger burger = new Burger();
        burger.addTopping(new Cheese()); // Assume Cheese is just a FoodItem with a fixed cost
        burger.addTopping(new Bacon());  // Assume Bacon is just a FoodItem with a fixed cost
        assertEquals(5.0 + Cheese.CHEESE_COST + Bacon.BACON_COST, burger.getCost(), "Burger with Cheese and Bacon should cost correctly");
    }

    @Test
    public void friesWithToppingsTest() {
        Fries fries = new Fries();
        fries.addTopping(new Cheese()); // Adding Cheese to fries
        assertEquals(2.0 + Cheese.CHEESE_COST, fries.getCost(), "Fries with Cheese should cost correctly");
    }

    @Test
    public void calculateTotalOrderTest() {
        Order order = new Order();
        Burger burger = new Burger();
        burger.addTopping(new Cheese());
        burger.addTopping(new Bacon());

        Fries fries = new Fries();
        fries.addTopping(new Cheese());

        HotDog hotDog = new HotDog();

        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        double expectedTotal = 5.0 + Cheese.CHEESE_COST + Bacon.BACON_COST + 2.0 + Cheese.CHEESE_COST + 3.0;
        assertEquals(expectedTotal, order.calculateTotal(), "Total cost of the order should be calculated correctly");
    }

    @Test
    public void applyLoyaltyDiscountTest() {
        Order order = new Order();
        Burger burger = new Burger();
        burger.addTopping(new Cheese());
        burger.addTopping(new Bacon());

        order.addItem(burger);

        double total = order.calculateTotal();
        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount();
        double discountedTotal = loyaltyDiscount.applyDiscount(total, true);
        assertEquals((5.0 + Cheese.CHEESE_COST + Bacon.BACON_COST) * 0.9, discountedTotal, "Discounted total should be calculated correctly for loyal customers");
    }
}

