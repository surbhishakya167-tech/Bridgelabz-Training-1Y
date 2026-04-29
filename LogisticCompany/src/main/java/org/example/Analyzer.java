package org.example;
class Analyzer {

    static double routeScore(RouteLinkedList<Checkpoint> route) {
        return route.computeTotalDistance() - route.computeTotalPenalty();
    }

    static boolean check(RouteLinkedList<Checkpoint> route) {
        boolean delivery = false;
        boolean fuel = false;

        Node<Checkpoint> temp = route.head;

        while (temp != null) {
            if (temp.data.getType().equals("Delivery")) delivery = true;
            if (temp.data.getType().equals("Fuel")) fuel = true;
            temp = temp.next;
        }

        return delivery && fuel;
    }
}