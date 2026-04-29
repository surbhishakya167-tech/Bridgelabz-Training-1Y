package org.example;
class DeliveryCheckpoint extends Checkpoint {

    DeliveryCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    String getType() {
        return "Delivery";
    }

    double calculatePenalty() {
        if (!isDelayed()) return 0;
        return (actual - expected) * 2;
    }

    boolean isCritical() {
        return true;
    }
}