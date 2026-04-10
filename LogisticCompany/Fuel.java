package LogisticCompany;
class Fuel extends Checkpoint {

    public Fuel(String name, double d, int e, int a) {
        super(name, d, e, a);
    }

    public double getPenalty() {
        return isDelayed() ? 10 : 0;
    }

    public String getType() {
        return "Fuel";
    }
}