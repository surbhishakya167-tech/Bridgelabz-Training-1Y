package TransformingNamesforDisplay;

import java.util.*;
        import java.util.stream.*;

public class CustomerDisplaySystem {

    public static void main(String[] args) {

        List<String> customers = Arrays.asList("Surbhi", "Aman", "Riya", "Karan");

        List<String> result = customers.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}