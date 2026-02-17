interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(name + ", Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(int id, String name, int age) {
        super(id,name,age);
    }
    public double calculateBill() { return 10000; }
    public void addRecord(String r) {}
    public void viewRecords() {}
}
