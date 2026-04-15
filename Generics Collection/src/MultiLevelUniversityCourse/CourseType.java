package MultiLevelUniversityCourse;

abstract class CourseType {
    String name;

    CourseType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}