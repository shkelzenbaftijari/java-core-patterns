package ex_invoice_app;

// ════════════════════════════════════════════════════════
// · INVOICE DTO · Exposes only name and amount (no internal fields)
// ════════════════════════════════════════════════════════
public class InvoiceDTO {

    private String name;
    private double amount;

    public InvoiceDTO(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() { return name; }
    public InvoiceDTO setName(String name) { this.name = name; return this; }

    public double getAmount() { return amount; }
    public InvoiceDTO setAmount(double amount) { this.amount = amount; return this; }

    @Override
    public String toString() {
        return "name=" + name + ", amount=" + amount;
    }
}
