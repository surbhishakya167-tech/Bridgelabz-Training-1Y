package FilteringExpiringMemberships;
import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;

public class GymManagementSystem {

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Aman", LocalDate.now().plusDays(10)),
                new Member("Riya", LocalDate.now().plusDays(40)),
                new Member("Karan", LocalDate.now().plusDays(25)),
                new Member("Surbhi", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()
                .filter(m -> m.expiryDate.isAfter(today) && m.expiryDate.isBefore(next30Days))
                .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}