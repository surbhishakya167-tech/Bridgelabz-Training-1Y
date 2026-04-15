package AIDrivenResumeScreening;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 = new Resume<>("Aman", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Riya", new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Karan", new ProductManager());

        ScreeningSystem.processResume(r1);
        ScreeningSystem.processResume(r2);
        ScreeningSystem.processResume(r3);

        List<Resume<? extends JobRole>> list = Arrays.asList(r1, r2, r3);
        ScreeningSystem.processAll(list);
    }
}