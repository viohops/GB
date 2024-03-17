package HW_1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Calculator {
    public double calculateDiscount(double totalAmount, double discountPercentage) {
        if (totalAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid input values");
        }
        double discountAmount = (totalAmount * discountPercentage) / 100;
        return totalAmount - discountAmount;
    }
}

public class CalculatorTest {
    @Test
    public void testCalculateDiscount() {
        Calculator calculator = new Calculator();

        // Valid input values
        Assertions.assertThat(calculator.calculateDiscount(100.0, 10.0))
            .isEqualTo(90.0);

        // Check if it rounds correctly
        Assertions.assertThat(calculator.calculateDiscount(101.0, 10.0))
            .isEqualTo(90.90);

        // Check if discount is 0%
        Assertions.assertThat(calculator.calculateDiscount(100.0, 0.0))
            .isEqualTo(100.0);

        // Check if discount is 100%
        Assertions.assertThat(calculator.calculateDiscount(100.0, 100.0))
            .isEqualTo(0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountInvalidInput() {
        Calculator calculator = new Calculator();

        // Negative total amount
        calculator.calculateDiscount(-100.0, 10.0);

        // Negative discount percentage
        calculator.calculateDiscount(100.0, -10.0);

        // Discount percentage > 100
        calculator.calculateDiscount(100.0, 110.0);
    }
}
