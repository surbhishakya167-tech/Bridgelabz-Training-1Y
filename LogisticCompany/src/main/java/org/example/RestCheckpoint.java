package org.example;
class RestCheckpoint extends Checkpoint {

    RestCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    String getType() {
        return "Rest";
    }

    double calculatePenalty() {
        int delay = actual - expected;
        if (isDelayed() && delay > 30)
            return delay * 0.5;
        return 0;
    }

    boolean isCritical() {
        return false;
    }
}