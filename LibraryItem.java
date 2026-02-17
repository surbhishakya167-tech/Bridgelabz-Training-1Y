interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String t, String a) { super(id,t,a); }
    public int getLoanDuration() { return 14; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}
