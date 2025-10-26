package SOLID.BadCode;

/**
 *
 *  SRP - Single Responsibility Principle: A class should have only one reason to change, meaning it should only have
 *  one responsibility.
 *  Example: A User class should only handle user-related logic, while database-related operations should be handled by
 *  a separate UserRepository class.
 */

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Additional Functionality
    public void generateInvoice() {
        System.out.println("Invoice generated & printed for amount" + amount);
    }

    // this should be different class
    public void saveToDatabase() {
        System.out.println("Saving invoice to database");
    }

    // this should be different class
    public void sendEmailNotification() {
        System.out.println("Sending email notification for invoice");
    }
}
