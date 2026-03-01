import java.util.function.Predicate;

public class TemperatureAlertApp {

    public static void main(String[] args) {

        double threshold = 40.0;

        Predicate<Double> alertCheck = temp -> temp > threshold;

        double currentTemp = 42.0;

        if (alertCheck.test(currentTemp)) {
            System.out.println("Alert! Temperature crossed threshold.");
        } else {
            System.out.println("Temperature is within safe limit.");
        }
    }
}