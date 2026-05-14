package ex_invoice_app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ════════════════════════════════════════════════════════
// · INVOICE REPOSITORY MOCK · In-memory data source
// ════════════════════════════════════════════════════════
public class InvoiceRepositoryMock {

    private List<Invoice> allInvoices = new ArrayList<>(Arrays.asList(
            new Invoice(1L,  "Apple Store",       1200.50, "REF-001"),
            new Invoice(2L,  "Supermarket",          45.20, "REF-002"),
            new Invoice(3L,  "Electric Bill",         89.00, "REF-003"),
            new Invoice(4L,  "Gas Station",           60.00, "REF-004"),
            new Invoice(5L,  "Laptop Repair",       1500.00, "REF-005"),
            new Invoice(6L,  "Amazon Purchase",      350.00, "REF-006"),
            new Invoice(7L,  "TechZone",             249.99, "REF-007"),
            new Invoice(8L,  "Coffee Shop",            8.50, "REF-008"),
            new Invoice(9L,  "Book Store",            32.40, "REF-009"),
            new Invoice(10L, "Pharmacy",              14.90, "REF-010"),
            new Invoice(11L, "Hardware Store",        78.00, "REF-011"),
            new Invoice(12L, "Cinema Tickets",        22.00, "REF-012"),
            new Invoice(13L, "Gym Membership",        39.99, "REF-013"),
            new Invoice(14L, "Car Wash",              12.00, "REF-014"),
            new Invoice(15L, "Taxi Service",          18.50, "REF-015"),
            new Invoice(16L, "Hotel Booking",        220.00, "REF-016"),
            new Invoice(17L, "Flight Ticket",        180.00, "REF-017"),
            new Invoice(18L, "Water Bill",            25.60, "REF-018"),
            new Invoice(19L, "Internet Provider",     29.99, "REF-019"),
            new Invoice(20L, "Mobile Operator",       15.00, "REF-020"),
            new Invoice(21L, "Furniture Store",      560.00, "REF-021"),
            new Invoice(22L, "Clothing Store",        89.90, "REF-022"),
            new Invoice(23L, "Shoe Store",           120.00, "REF-023"),
            new Invoice(24L, "Electronics Shop",     430.00, "REF-024"),
            new Invoice(25L, "Pet Store",             19.99, "REF-025"),
            new Invoice(26L, "Vet Clinic",            75.00, "REF-026"),
            new Invoice(27L, "Fast Food",             11.20, "REF-027"),
            new Invoice(28L, "Restaurant",            56.80, "REF-028"),
            new Invoice(29L, "Barbershop",            15.00, "REF-029"),
            new Invoice(30L, "Beauty Salon",          45.00, "REF-030"),
            new Invoice(31L, "Online Course",         99.00, "REF-031"),
            new Invoice(32L, "Software License",     149.00, "REF-032"),
            new Invoice(33L, "Streaming Service",     12.99, "REF-033"),
            new Invoice(34L, "Parking Ticket",         4.00, "REF-034"),
            new Invoice(35L, "Public Transport",       2.50, "REF-035")
    ));

    public List<Invoice> getAll() {
        return allInvoices;
    }

}
