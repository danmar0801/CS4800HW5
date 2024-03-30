public class Main {
    public static void main(String[] args) {
        // Create food items
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();
        FoodItem hotDog = new HotDog();

        // Decorate food items with toppings
        FoodItem cheeseBurger = new Cheese(burger);
        FoodItem baconCheeseBurger = new Bacon(cheeseBurger); // Burger with Cheese and Bacon
        FoodItem cheeseFries = new Cheese(fries); // Fries with Cheese

        // Displaying the cost of decorated items
        System.out.println("Burger with cheese and bacon cost: " + baconCheeseBurger.getCost());
        System.out.println("Fries with cheese cost: " + cheeseFries.getCost());
        System.out.println("Hot dog cost (no toppings): " + hotDog.getCost());

        // Creating an order and adding the decorated items
        Order order = new Order();
        order.addItem(baconCheeseBurger);
        order.addItem(cheeseFries);
        order.addItem(hotDog);

        // Calculating the total cost of the order
        double total = order.calculateTotal();
        System.out.println("Total cost: " + total);

        // Applying a loyalty discount
        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount();
        double discountedTotal = loyaltyDiscount.applyDiscount(total, true);

        System.out.println("Total cost after loyalty discount: " + discountedTotal);
    }
}


