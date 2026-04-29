package org.example;
class Driver {
    String id;
    String name;
    RouteLinkedList<Checkpoint> route;

    Driver(String id, String name) {
        this.id = id;
        this.name = name;
        this.route = new RouteLinkedList<>();
    }
}