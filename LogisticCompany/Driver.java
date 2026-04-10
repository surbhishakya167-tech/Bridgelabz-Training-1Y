package LogisticCompany;
class Driver {
    String id, name;
    RouteList route = new RouteList();

    Driver(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println("Driver: " + id + " - " + name);

        route.print();

        double d = route.totalDistance();
        double p = route.totalPenalty();

        System.out.println("Distance: " + d);
        System.out.println("Penalty: " + p);
        System.out.println("Score: " + (d - p));
    }
}