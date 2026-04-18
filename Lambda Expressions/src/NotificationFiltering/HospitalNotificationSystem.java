package NotificationFiltering;
import java.util.*;
        import java.util.function.Predicate;

public class HospitalNotificationSystem {

    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();

        alerts.add(new Alert("Emergency", "Heart rate critical"));
        alerts.add(new Alert("Reminder", "Take medicine at 8 PM"));
        alerts.add(new Alert("Info", "Doctor visit scheduled"));
        alerts.add(new Alert("Emergency", "Blood pressure high"));

        Predicate<Alert> emergencyFilter = a -> a.type.equals("Emergency");
        Predicate<Alert> reminderFilter = a -> a.type.equals("Reminder");

        display(alerts, emergencyFilter);
        display(alerts, reminderFilter);
    }

    public static void display(List<Alert> alerts, Predicate<Alert> filter) {
        for (Alert a : alerts) {
            if (filter.test(a)) {
                System.out.println(a);
            }
        }
        System.out.println();
    }
}