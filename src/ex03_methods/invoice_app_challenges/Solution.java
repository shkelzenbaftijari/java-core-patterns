package ex03_methods.invoice_app_challenges;

// ════════════════════════════════════════════════════════
// · SOLUTION · Entry point for invoice method challenges
// ════════════════════════════════════════════════════════
public class Solution {
    static void main(String[] args) {

        Invoice inv = new Invoice("Demo Client", 1000.0, "DE89370400440532013000");
        System.out.println();

        // · 1. PRINT ·············································
        inv.printInvoice();
        System.out.println();

        // · 2. SEND ··············································
        inv.sendInvoice("user@example.com");
        System.out.println();

        // · 3–10. CALCULATIONS ···································
        System.out.println(inv.calculateTax(100, 0.20));
        System.out.println(inv.calculateTotal(500, 0.20));
        System.out.println(inv.isValidAmount(35.5));
        System.out.println(inv.isValidIban("DE454564656"));
        System.out.println(inv.applyDiscount(100, 5));
        inv.processInvoice(100, 0.18, 20);
        System.out.println(inv.convertCurrency(20, 'e'));
        System.out.println(inv.generateSummary("PC", 1000, "DE12345", 0.18));
        System.out.println();
    }
}

// ════════════════════════════════════════════════════════
// · INVOICE · Method-based invoice model for exercises
// ════════════════════════════════════════════════════════
class Invoice {

    String name;
    double amount;
    String iban;

    public Invoice(String name, double amount, String iban) {
        this.name = name;
        this.amount = amount;
        this.iban = iban;
    }

    // · 1. Print all invoice fields in a formatted message.
    public void printInvoice() {
        System.out.println("Name: " + name + " | Amount: " + amount + " | IBAN: " + iban);
    }

    // · 2. Print a confirmation that the invoice was sent to a given email.
    public void sendInvoice(String email) {
        System.out.println("Invoice sent to: " + email);
    }

    // · 3. Return the tax amount (amount × taxRate).
    public double calculateTax(double amount, double taxRate) {
        return amount * taxRate;
    }

    // · 4. Return the total including tax.
    public double calculateTotal(double amount, double taxRate) {
        return amount + calculateTax(amount, taxRate);
    }

    // · 5. Return true if amount is greater than zero.
    public boolean isValidAmount(double amount) {
        return amount > 0;
    }

    // · 6. Return true if iban starts with 2 letters and is at least 15 chars long.
    public boolean isValidIban(String iban) {
        return Character.isLetter(iban.charAt(0)) &&
                Character.isLetter(iban.charAt(1)) &&
                iban.length() >= 15;
    }

    // · 7. Return the amount after discount is applied.
    public double applyDiscount(double amount, double discountPercent) {
        return amount - (amount * discountPercent / 100);
    }

    // · 8. Apply discount first, then calculate total. (calls #4 and #7)
    public void processInvoice(double amount, double taxRate, double discountPercent) {
        double discounted = applyDiscount(amount, discountPercent);
        double total = calculateTotal(discounted, taxRate);
        System.out.println("Final total after discount and tax: " + total);
    }

    // · 9. Support 'u' for USD, 'g' for GBP, 'e' for EUR using fixed rates.
    public double convertCurrency(double amount, char targetCurrency) {
        if (targetCurrency == 'u')      return amount * 1.08;
        else if (targetCurrency == 'g') return amount * 1.21;
        else if (targetCurrency == 'e') return amount * 0.95;
        else {
            System.out.println("Unknown currency: " + targetCurrency);
            return 0.0;
        }
    }

    // · 10. Return a full formatted invoice string.
    public String generateSummary(String name, double amount, String iban, double taxRate) {
        double tax = calculateTax(amount, taxRate);
        double total = calculateTotal(amount, taxRate);
        return "--- INVOICE ---\nName: " + name + "\nIBAN: " + iban +
                "\nAmount: " + amount + "\nTax: " + tax + "\nTotal: " + total;
    }

}
