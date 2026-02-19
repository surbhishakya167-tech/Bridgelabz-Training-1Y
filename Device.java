class Device {
    int deviceId;
    String status;

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    void showDevice() {
        displayStatus();
        System.out.println("Temperature: " + temperatureSetting);
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {

        Thermostat t = new Thermostat();
        t.deviceId = 101;
        t.status = "ON";
        t.temperatureSetting = 25.0;

        t.showDevice();
    }
}
