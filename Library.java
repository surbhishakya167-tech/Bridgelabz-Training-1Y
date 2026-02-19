package com.gla;

public class Library {
   private int quantity;
   private Admin admin;
   private LibraryRepositary libraryrepositary = new LibraryRepositary();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public LibraryRepositary getLibraryrepositary() {
        return libraryrepositary;
    }

    public void setLibraryrepositary(LibraryRepositary libraryrepositary) {
        this.libraryrepositary = libraryrepositary;
    }
}
