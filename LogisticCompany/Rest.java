package LogisticCompany;

class Rest extends Checkpoint {

    public Rest(String name, double d, int e, int a) {
        super(name, d, e, a);
    }

    public double getPenalty() {
        if (getDelay() > 30)
            return getDelay() * 0.5;
        return 0;
    }

    public String getType() {
        return "Rest";
    }
}
