package ch.tbz.m450;

public class PreisberechnungTestDriver {

    public static void main(String[] args) {
        PreisberechnungTestDriver testDriver = new PreisberechnungTestDriver();
        testDriver.testCalculatePrice();
    }

    boolean testCalculatePrice() {
        boolean testOk = true;

        // Test Case 1: No extras, no discount
        double result1 = calculatePrice(100.0, 20.0, 10.0, 0, 0.0);
        if (!assertEquals(result1, 130.0)) {
            testOk = false;
            System.out.println("Test Case 1 failed");
        }

        // Test Case 2: 3 extras, discount greater than addon discount
        double result2 = calculatePrice(100.0, 20.0, 10.0, 3, 15.0);
        if (!assertEquals(result2, 132.5)) {
            testOk = false;
            System.out.println("Test Case 2 failed");
        }

        // Test Case 3: 5 extras, discount less than addon discount
        double result3 = calculatePrice(100.0, 20.0, 10.0, 5, 5.0);
        if (!assertEquals(result3, 129.5)) {
            testOk = false;
            System.out.println("Test Case 3 failed");
        }

        // Add more test cases as needed...

        if (testOk) {
            System.out.println("All test cases passed!");
        }

        return testOk;
    }

    // Helper method to compare doubles within a certain tolerance
    boolean assertEquals(double actual, double expected) {
        double tolerance = 0.001;
        return Math.abs(actual - expected) < tolerance;
    }

    // Your original calculatePrice method
    double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addon_discount;
        double result;

        if (extras >= 3)
            addon_discount = 10;
        else if (extras >= 5)
            addon_discount = 15;
        else
            addon_discount = 0;

        if (discount > addon_discount)
            addon_discount = discount;

        result = baseprice / 100.0 * (100 - discount) + specialprice
                + extraprice / 100.0 * (100 - addon_discount);

        return result;
    }
}