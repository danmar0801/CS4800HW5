public class LoyaltyDiscount {
    public double applyDiscount(double total, boolean isLoyalCustomer) {
        if (isLoyalCustomer) {
            return total * 0.9; // 10% discount
        } else {
            return total;
        }
    }
}

