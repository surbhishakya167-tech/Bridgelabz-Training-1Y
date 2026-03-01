public class ElectricCar implements VehicleDashboard {

    public void displaySpeed(int speed) {
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public void displayBattery(int percentage) {
        System.out.println("Battery Level: " + percentage + "%");
    }
}