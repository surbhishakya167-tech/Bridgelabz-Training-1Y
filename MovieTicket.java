class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Avengers", 15, 300);
        ticket.displayTicket();
    }
}
