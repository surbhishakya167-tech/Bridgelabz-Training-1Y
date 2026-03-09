package college.department;

public class Department {

    private String deptName;
    private String hod;

    public Department(String deptName, String hod) {
        this.deptName = deptName;
        this.hod = hod;
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        System.out.println("HOD: " + hod);
    }
}