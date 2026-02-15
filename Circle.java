class Circle {
    double Radius;

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;
        c1.display();
    }
}
