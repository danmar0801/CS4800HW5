public class Main {
    public static void main(String[] args) {
        // Create food items
        Burger burger = new Burger();
        Fries fries = new Fries();
        HotDog hotDog = new HotDog();

        // Add toppings directly to the food items
        burger.addTopping(new Cheese(burger)); // Note: Passing 'burger' here might not be necessary anymore due to the updated structure.
        burger.addTopping(new Bacon(burger));  // Same note as above.
        fries.addTopping(new Cheese(fries));   // Adding cheese to fries as an example.
        // No toppings added to hotDog for this example

        // Displaying the cost of individual items with toppings
        System.out.println("Burger with toppings cost: " + burger.getCost());
        System.out.println("Fries with toppings cost: " + fries.getCost());
        System.out.println("HotDog cost (no toppings): " + hotDog.getCost());

        // Creating an order and adding the items
        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        // Calculating the total cost of the order
        double total = order.calculateTotal();
        System.out.println("Total cost before discount: " + total);

        // Applying a loyalty discount
        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount();
        boolean isLoyalCustomer = true; // Example: the customer is a loyal customer
        double discountedTotal = loyaltyDiscount.applyDiscount(total, isLoyalCustomer);

        System.out.println("Total cost after loyalty discount: " + discountedTotal);
    }
}


