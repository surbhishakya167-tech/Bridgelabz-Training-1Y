package InsuranceClaimAnalysis;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class InsuranceAnalysisSystem {

    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Auto", 8000),
                new Claim("Health", 7000),
                new Claim("Home", 12000),
                new Claim("Auto", 6000)
        );

        Map<String, Double> avgClaims = claims.stream()
                .collect(Collectors.groupingBy(
                        c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)
                ));

        avgClaims.forEach((type, avg) ->
                System.out.println(type + " : " + avg)
        );
    }
}