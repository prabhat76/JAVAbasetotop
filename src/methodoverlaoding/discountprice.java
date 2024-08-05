package methodoverlaoding;


class DiscountCalculator{
    double calculateDiscount(double price, double percentage) {
        return price * (percentage / 100);
    }

    // Overloaded method to calculate discount for a fixed amount
    double calculateDiscount(double price, double discountAmount, boolean isFixed) {
        return discountAmount;
    }

    // Overloaded method to calculate discount based on customer loyalty
    double calculateDiscount(double price, int loyaltyPoints) {
        return price * (loyaltyPoints / 1000.0); // For every 1000 points, give 1% discount
    }
}

public class discountprice {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        // Calculate discount using different methods
        double percentageDiscount = calculator.calculateDiscount(1000, 10); // 10% discount
        double fixedDiscount = calculator.calculateDiscount(1000, 100, true); // $100 discount
        double loyaltyDiscount = calculator.calculateDiscount(1000, 500); // Loyalty points discount

        System.out.println("Percentage Discount: " + percentageDiscount);
        System.out.println("Fixed Discount: " + fixedDiscount);
        System.out.println("Loyalty Discount: " + loyaltyDiscount);
    }
}


//make this user input

