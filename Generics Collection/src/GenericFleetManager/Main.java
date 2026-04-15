package GenericFleetManager;

public class Main {
    public static void main(String[] args) {

        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Truck A"));
        truckFleet.addVehicle(new Truck("Truck B"));
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Bike X"));
        bikeFleet.addVehicle(new Bike("Bike Y"));
        bikeFleet.showFleet();
    }
}