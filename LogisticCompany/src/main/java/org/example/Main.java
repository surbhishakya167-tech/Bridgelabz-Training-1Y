package org.example;
public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        RouteLinkedList<Checkpoint> route = d.route;

        route.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 10, 30, 40));
        route.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 25, 15, 15));
        route.addCheckpoint(new RestCheckpoint("C3", "Motel X", 50, 60, 100));
        route.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 35, 20, 40));

        System.out.println("Driver: " + d.id + " - " + d.name);
        System.out.println("\nRoute Summary:");

        route.printRoute();

        double totalDistance = route.computeTotalDistance();
        double totalPenalty = route.computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("\nTotal Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        boolean isValid = Analyzer.check(route);
        System.out.println("Critical Route Check: " +
                (isValid ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}