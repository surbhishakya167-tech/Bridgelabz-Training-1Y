import java.time.LocalTime;

class DeviceThread implements Runnable {
    String deviceName;
    int interval;

    DeviceThread(String name, int time) {
        deviceName = name;
        interval = time;
    }

    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Device: " + deviceName +
                    " | Priority: " + t.getPriority() +
                    " | Time: " + LocalTime.now());

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class SmartHome {
    public static void main(String[] args) {

        Thread temp = new Thread(new DeviceThread("Temperature Sensor", 5000));
        Thread security = new Thread(new DeviceThread("Security Camera", 3000));
        Thread light = new Thread(new DeviceThread("Light Controller", 4000));
        Thread door = new Thread(new DeviceThread("Door Lock Monitor", 6000));

        security.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        security.start();
        temp.start();
        light.start();
        door.start();
    }
}