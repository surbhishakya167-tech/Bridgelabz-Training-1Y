package LogisticCompany;
abstract class Checkpoint {
    private String name;
    private double distance;
    private int expected, actual;

    public Checkpoint(String name, double distance, int expected, int actual) {
        this.name = name;
        this.distance = distance;
        this.expected = expected;
        this.actual = actual;
    }

    public boolean isDelayed() {
        return actual > expected;
    }

    public double getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public int getDelay() {
        return actual - expected;
    }

    public abstract double getPenalty();   // Abstraction
    public abstract String getType();
}
