class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new TextBook(101, "Java", 500);
        Book b2 = new Magazine(201, "Tech", 200);

        System.out.println("Fine: " + b1.calculateFine(3));
        System.out.println("Fine: " + b2.calculateFine(3));
    }
}