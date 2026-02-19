class Book {
    String title;
    int publicationYear;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    void showDetails() {
        displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryTest {
    public static void main(String[] args) {

        Author a = new Author();
        a.title = "Java Programming";
        a.publicationYear = 2023;
        a.name = "Surbhi";
        a.bio = "Java Developer";

        a.showDetails();
    }
}
