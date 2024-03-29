public class Main {
    public static void main(String[] args) {
        // Create food items
        Burger burger = new Burger();
        Fries fries = new Fries();
        HotDog hotDog = new HotDog();

        // Add toppings to the food items
        burger.addTopping(new Cheese()); // Assume Cheese is now just a FoodItem with a fixed cost
        burger.addTopping(new Bacon());  // Assume Bacon is now just a FoodItem with a fixed cost
        fries.addTopping(new Cheese());  // You can add the same topping to different food items

        // Calculate the cost of each item
        System.out.println("Cost of a burger with toppings: $" + burger.getCost());
        System.out.println("Cost of fries with toppings: $" + fries.getCost());
        System.out.println("Cost of a hot dog: $" + hotDog.getCost());

        // Create an order and add the items
        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        // Calculate the total cost of the order
        double totalCost = order.calculateTotal();
        System.out.println("Total cost of the order: $" + totalCost);

        // Apply loyalty discount if applicable
        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount();
        boolean isLoyalCustomer = true; // Example condition, this could be determined by some other logic in your system
        double discountedCost = loyaltyDiscount.applyDiscount(totalCost, isLoyalCustomer);

        System.out.println("Total cost after loyalty discount: $" + discountedCost);
    }
}


