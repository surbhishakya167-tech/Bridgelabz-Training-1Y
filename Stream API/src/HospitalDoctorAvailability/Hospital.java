package HospitalDoctorAvailability;

import java.util.*;
        import java.util.stream.*;

public class Hospital {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedics", true),
                new Doctor("Dr. D", "Dermatology", true),
                new Doctor("Dr. E", "Pediatrics", false)
        );

        List<Doctor> result = doctors.stream()
                .filter(d -> d.weekendAvailable)
                .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}