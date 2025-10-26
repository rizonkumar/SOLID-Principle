package SOLID.OCP.BadCode;

/**
 * Open/Close Principle
 * Software entities (classes, modules, functions) should be open for extension but closed for modification.
 * Example: Adding new functionality to a system using inheritance or composition without modifying existing code.
 */

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if(paymentMethod.equals("CreditCard")) {
            // business logic
            System.out.println("Payment via credit card" + amount);
        }
        else if(paymentMethod.equals("DebitCard")) {
            // business logic
            System.out.println("Payment via debit card" + amount);
        }
        else if(paymentMethod.equals("Paypal")) {
            // business logic
            System.out.println("Payment via paypal" + amount);
        }
        else {
            throw new IllegalArgumentException("Unsupported payment method" + paymentMethod);
        }
    }
}
