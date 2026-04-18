package InvoiceObjectCreation;

import java.util.*;
        import java.util.stream.*;

public class InvoiceGenerator {

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("T101", "T102", "T103");

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}