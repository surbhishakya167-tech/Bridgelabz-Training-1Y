class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;

    void displayRole() {
        System.out.println("Role: Teacher");
    }
}

class Student extends Person {
    String grade;

    void displayRole() {
        System.out.println("Role: Student");
    }
}

class Staff extends Person {
    String department;

    void displayRole() {
        System.out.println("Role: Staff");
    }
}

public class SchoolTest {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.name = "Surbhi";
        t.age = 30;
        t.subject = "Computer Science";

        t.displayRole();
        System.out.println("Name: " + t.name);
        System.out.println("Age: " + t.age);
        System.out.println("Subject: " + t.subject);

        System.out.println("------------");

        Student s = new Student();
        s.name = "Rahul";
        s.age = 18;
        s.grade = "A";

        s.displayRole();
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Grade: " + s.grade);
    }
}
