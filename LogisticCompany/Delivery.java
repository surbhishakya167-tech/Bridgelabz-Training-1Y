package LogisticCompany;
class Delivery extends Checkpoint {

    public Delivery(String name, double d, int e, int a) {
        super(name, d, e, a);
    }

    public double getPenalty() {
        if (isDelayed())
            return getDelay() * 2;
        return 0;
    }

    public String getType() {
        return "Delivery";
    }
}