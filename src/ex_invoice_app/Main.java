package ex_invoice_app;

import java.util.List;

// ════════════════════════════════════════════════════════
// · MAIN · Invoice app demo — CRUD without a framework
// ════════════════════════════════════════════════════════
public class Main {
    public static void main(String[] args) {

        InvoiceService service = new InvoiceService();

        // · GET ALL ··············································
        List<InvoiceDTO> allInvoices = service.getAllInvoicesClassic();
        System.out.println("--- All Invoices ---");
        for (InvoiceDTO d : allInvoices) {
            System.out.println("Invoice: " + d.getName() + " | Amount: " + d.getAmount());
        }
        System.out.println();

        // · GET BY ID ············································
        InvoiceDTO byId = service.getInvoiceByIdClassic(5L);
        if (byId != null) {
            System.out.println("--- Invoice ID 5: " + byId.getName());
        } else {
            System.out.println("--- Invoice ID 5 not found.");
        }
        System.out.println();

        // · GET BY NAME ··········································
        List<InvoiceDTO> byName = service.getInvoicesByNameClassic("Apple Store");
        for (InvoiceDTO d : byName) {
            System.out.println("--- Found by name: " + d.getName());
        }
        System.out.println();

        // · CREATE ···············································
        service.createInvoiceClassic(new InvoiceDTO("Laptop", 550.00));
        System.out.println("Invoice count after create: " + service.getAllInvoicesClassic().size());
        System.out.println();

        // · UPDATE ···············································
        service.updateInvoiceAmountClassic(1L, 999.99);
        System.out.println("Invoice ID 1 after update: " + service.getInvoiceByIdClassic(1L));
        System.out.println();

        // · DELETE ···············································
        service.deleteInvoiceClassic(2L);
        System.out.println("Invoice count after delete: " + service.getAllInvoicesClassic().size());
        System.out.println();
    }

}
