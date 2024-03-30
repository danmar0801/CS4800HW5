public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Cheese(new Burger()));
        order.addItem(new Bacon(new Fries()));

        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount();
        double total = order.calculateTotal();
        double discountedTotal = loyaltyDiscount.applyDiscount(total, true);

        System.out.println("Total cost: " + discountedTotal);
    }
}

