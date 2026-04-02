import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {25, 30, 22, 45, 28, 19, 50};

        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages) {
            ageList.add(Integer.valueOf(age));
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest age: " + youngest);
        System.out.println("Oldest age: " + oldest);
    }
}