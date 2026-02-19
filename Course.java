class Course {
    String courseName;
    int duration;
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
}

public class CourseTest {
    public static void main(String[] args) {

        PaidOnlineCourse p = new PaidOnlineCourse();
        p.courseName = "Data Science";
        p.duration = 6;
        p.platform = "Udemy";
        p.isRecorded = true;
        p.fee = 5000;
        p.discount = 500;

        System.out.println("Course Name: " + p.courseName);
        System.out.println("Duration: " + p.duration + " months");
        System.out.println("Platform: " + p.platform);
        System.out.println("Recorded: " + p.isRecorded);
        System.out.println("Fee: " + p.fee);
        System.out.println("Discount: " + p.discount);
    }
}
