interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class VehicleRide {
    protected String driverName;
    protected double ratePerKm;

    public VehicleRide(String driver, double rate) {
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName);
    }
}

class CarRide extends VehicleRide implements GPS {
    private String location;
    public CarRide(String driver, double rate) {
        super(driver, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}
