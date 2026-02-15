class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", 500);
        b.display();
        b.borrowBook();
        b.display();
    }
}
