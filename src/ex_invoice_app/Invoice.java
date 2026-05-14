package ex_invoice_app;

// ════════════════════════════════════════════════════════
// · INVOICE · Entity model with fluent setters
// ════════════════════════════════════════════════════════
public class Invoice {

    private Long id;
    private String name;
    private double amount;
    private String reference;

    public Invoice(Long id, String name, double amount, String reference) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.reference = reference;
    }

    // · GETTERS & SETTERS ····································

    public Long getId() { return id; }
    public Invoice setId(Long id) { this.id = id; return this; }

    public String getName() { return name; }
    public Invoice setName(String name) { this.name = name; return this; }

    public double getAmount() { return amount; }
    public Invoice setAmount(double amount) { this.amount = amount; return this; }

    public String getReference() { return reference; }
    public Invoice setReference(String reference) { this.reference = reference; return this; }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", amount=" + amount + ", ref=" + reference;
    }
}
