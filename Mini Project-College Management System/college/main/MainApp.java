package college.main;

import college.student.*;
import college.faculty.*;
import college.department.*;

import static java.lang.Math.*;

public class MainApp {

    public static void main(String[] args) {

        Student s = new Student(101, "Rahul", "Computer Science");
        Faculty f = new Faculty("Dr Sharma", "Java Programming");
        Department d = new Department("Computer Science", "Dr Verma");

        System.out.println("College Management System\n");

        d.displayDepartment();
        System.out.println();

        f.displayFaculty();
        System.out.println();

        s.displayStudent();
        System.out.println();

        System.out.println("Example Static Import (sqrt of 16): " + sqrt(16));
    }
}