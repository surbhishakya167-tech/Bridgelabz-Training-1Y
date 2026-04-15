package GenericFleetManager;
import java.util.*;

class FleetManager<T extends Vehicle> {
    private List<T> vehicles = new ArrayList<>();

    public void addVehicle(T vehicle) {
        vehicles.add(vehicle);
    }

    public void showFleet() {
        for (T v : vehicles) {
            System.out.println(v);
        }
    }
}