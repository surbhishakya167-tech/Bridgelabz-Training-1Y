class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Surbhi";
        emp1.id = 101;
        emp1.salary = 50000;
        emp1.displayDetails();
    }
}
