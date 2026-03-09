class Course {
    int courseId;
    String courseName;
    double price;
    static String platformName = "LearnHub";

    Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
    }

    double getFinalPrice() {
        return price;
    }
}