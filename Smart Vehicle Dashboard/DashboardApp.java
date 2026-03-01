public class DashboardApp {
    public static void main(String[] args) {

        VehicleDashboard car = new Car();
        car.displaySpeed(80);
        car.displayBattery(0);

        VehicleDashboard ev = new ElectricCar();
        ev.displaySpeed(100);
        ev.displayBattery(75);
    }
}