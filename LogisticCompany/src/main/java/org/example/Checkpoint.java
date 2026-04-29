package org.example;
abstract class Checkpoint {
    String id;
    String location;
    double distance;
    int expected;
    int actual;

    Checkpoint(String id, String location, double distance, int expected, int actual) {
        this.id = id;
        this.location = location;
        this.distance = distance;
        this.expected = expected;
        this.actual = actual;
    }

    boolean isDelayed() {
        return actual > expected;
    }

    abstract String getType();
    abstract double calculatePenalty();
    abstract boolean isCritical();
}