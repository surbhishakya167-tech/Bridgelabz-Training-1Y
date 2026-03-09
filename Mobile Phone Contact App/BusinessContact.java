class BusinessContact extends Contact {

    String companyName;

    BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    void display() {
        System.out.println(name.toUpperCase() + " - " + phoneNumber + " - " + companyName);
    }
}