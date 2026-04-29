package org.example;
class FuelCheckpoint extends Checkpoint {

    FuelCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    String getType() {
        return "Fuel";
    }

    double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }

    boolean isCritical() {
        return true;
    }
}