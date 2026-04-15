package AIDrivenResumeScreening;

import java.util.*;

class ScreeningSystem {

    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing: " + resume);
    }

    public static void processAll(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> r : resumes) {
            System.out.println("Screening: " + r);
        }
    }
}