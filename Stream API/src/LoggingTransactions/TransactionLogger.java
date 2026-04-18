package LoggingTransactions;

import java.util.*;
import java.time.LocalDateTime;

public class TransactionLogger {

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("T101", "T102", "T103");

        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}