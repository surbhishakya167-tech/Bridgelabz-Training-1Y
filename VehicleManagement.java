class VehicleManagement {
    int maxSpeed;
    String model;
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {

    void charge() {
        System.out.println("Electric Vehicle is charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    public void refuel() {
        System.out.println("Petrol Vehicle is refueling");
    }
}

public class VehicleTest {
    public static void main(String[] args) {

        ElectricVehicle e = new ElectricVehicle();
        e.model = "Tesla";
        e.maxSpeed = 200;
        e.charge();

        PetrolVehicle p = new PetrolVehicle();
        p.model = "Honda";
        p.maxSpeed = 180;
        p.refuel();
    }
}
