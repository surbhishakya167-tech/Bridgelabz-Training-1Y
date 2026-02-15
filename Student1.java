class Student1 {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent();
        p.rollNumber = 101;
        p.name = "Surbhi";
        p.setCGPA(8.9);
        p.display();
    }
}
