package EventAttendeeWelcomeMessage;

import java.util.*;

public class EventWelcomeSystem {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Surbhi", "Aman", "Riya", "Karan");

        attendees.forEach(name ->
                System.out.println("Welcome " + name + " to the event!")
        );
    }
}