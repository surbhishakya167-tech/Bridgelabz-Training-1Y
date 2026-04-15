package MultiLevelUniversityCourse;

import java.util.*;
public class Main {

    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType c : list) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Math"));
        examCourses.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("English"));
        assignmentCourses.addCourse(new AssignmentCourse("History"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));
        researchCourses.addCourse(new ResearchCourse("Data Science"));

        displayCourses(examCourses.getCourses());
        displayCourses(assignmentCourses.getCourses());
        displayCourses(researchCourses.getCourses());
    }
}