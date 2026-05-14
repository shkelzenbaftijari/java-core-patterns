package ex_invoice_app;

import java.util.ArrayList;
import java.util.List;

// ════════════════════════════════════════════════════════
// · INVOICE SERVICE · Business logic layer (no framework)
// ════════════════════════════════════════════════════════
public class InvoiceService {

    private InvoiceRepositoryMock repo = new InvoiceRepositoryMock();

    // · 1. GET ALL ············································
    public List<InvoiceDTO> getAllInvoicesClassic() {
        List<Invoice> entities = repo.getAll();
        List<InvoiceDTO> dtos = new ArrayList<>();

        for (Invoice inv : entities) {
            dtos.add(new InvoiceDTO(inv.getName(), inv.getAmount()));
        }
        return dtos;
    }

    // · 2. GET BY ID ··········································
    public InvoiceDTO getInvoiceByIdClassic(Long id) {
        for (Invoice inv : repo.getAll()) {
            if (inv.getId().equals(id)) {
                return new InvoiceDTO(inv.getName(), inv.getAmount());
            }
        }
        return null;
    }

    // · 3. GET BY NAME ········································
    public List<InvoiceDTO> getInvoicesByNameClassic(String name) {
        List<InvoiceDTO> results = new ArrayList<>();

        for (Invoice inv : repo.getAll()) {
            if (inv.getName().equalsIgnoreCase(name)) {
                results.add(new InvoiceDTO(inv.getName(), inv.getAmount()));
            }
        }
        return results;
    }

    // · 4. CREATE ·············································
    public void createInvoiceClassic(InvoiceDTO dto) {
        List<Invoice> all = repo.getAll();
        Long newId = (long) (all.size() + 1);
        all.add(new Invoice(newId, dto.getName(), dto.getAmount(), "REF-GENERATED"));
    }

    // · 5. UPDATE ·············································
    public void updateInvoiceAmountClassic(Long id, double newAmount) {
        for (Invoice inv : repo.getAll()) {
            if (inv.getId().equals(id)) {
                inv.setAmount(newAmount);
                return;
            }
        }
        System.out.println("Update failed: invoice not found with ID " + id);
    }

    // · 6. DELETE ·············································
    public void deleteInvoiceClassic(Long id) {
        List<Invoice> all = repo.getAll();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getId().equals(id)) {
                all.remove(i);
                System.out.println("Invoice with ID " + id + " deleted successfully.");
                return;
            }
        }
    }

}
