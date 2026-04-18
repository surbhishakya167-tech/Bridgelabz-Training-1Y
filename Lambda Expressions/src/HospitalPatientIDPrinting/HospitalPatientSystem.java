package HospitalPatientIDPrinting;

import java.util.*;

public class HospitalPatientSystem {

    public static void main(String[] args) {

        List<String> patientIds = new ArrayList<>();

        patientIds.add("P101");
        patientIds.add("P102");
        patientIds.add("P103");
        patientIds.add("P104");

        patientIds.forEach(System.out::println);
    }
}