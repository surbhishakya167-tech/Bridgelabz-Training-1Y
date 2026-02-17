import java.util.*;
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    protected double baseSalary;
    private String department;

    public Employee(int id, String name, double baseSalary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }

    public void setBaseSalary(double salary) { this.baseSalary = salary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name +
                ", Salary: " + calculateSalary() +
                ", Dept: " + department);
    }

    public void assignDepartment(String dept) { this.department = dept; }
    public String getDepartmentDetails() { return department; }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    public double calculateSalary() { return baseSalary; }
}

class PartTimeEmployee extends Employee {
    private int hours;
    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hours = hours;
    }
    public double calculateSalary() { return baseSalary * hours; }
}

public class Main1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee(1, "Aman", 50000));
        list.add(new PartTimeEmployee(2, "Riya", 500, 40));

        for (Employee e : list) {
            e.assignDepartment("IT");
            e.displayDetails();
        }
    }
}
