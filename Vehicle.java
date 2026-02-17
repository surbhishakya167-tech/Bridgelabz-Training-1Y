interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    protected double rentalRate;

    public Vehicle(String number, double rate) {
        this.vehicleNumber = number;
        this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String no, double rate) { super(no, rate); }
    public double calculateRentalCost(int days) { return rentalRate * days; }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Car Insurance"; }
}
