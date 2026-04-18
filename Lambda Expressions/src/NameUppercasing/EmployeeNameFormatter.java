package NameUppercasing;

import java.util.*;
        import java.util.stream.*;

public class EmployeeNameFormatter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Surbhi", "Aman", "Riya", "Karan");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}