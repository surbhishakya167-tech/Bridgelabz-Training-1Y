import java.time.LocalDate;

public class InvoiceApp {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String format1 = DateFormatterUtil.formatDate(today, "dd-MM-yyyy");
        String format2 = DateFormatterUtil.formatDate(today, "yyyy/MM/dd");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
    }
}