package ObjectOrientedProgramming;

public class Book {
    String title;
    String author;
    int isbn;
    static int totalBooks;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    { // Object init
        totalBooks++;
    }

    Book(int isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(int isbn) {
        this.isbn = isbn;
        this.title = "Unknown";
        this.author = "Unknown";
    }

    static int getTotalBooks(int totalBooks){
        return Book.totalBooks;
    }

    void BorrowBook(){
        if(isBorrowed){
            System.out.println("Book is Already Borrowed.");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Enjoy "+this.title +" book.");
        }
    }

    void ReturnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoy "+this.title+" book. Please give some review.");
        }
        else{
            System.out.println("This book is already in the library.");
        }
    }

    public static void main(String[] args) {
        Book SystemDesigning = new Book(1, "Design", "RajpalYadav");
        Book DeepKnowledge = new Book(2, "Unknown", "Unknown");
        System.out.println(Book.totalBooks+" is total books are borrowed today.");
        SystemDesigning.BorrowBook();
        DeepKnowledge.BorrowBook();
        SystemDesigning.BorrowBook();

        SystemDesigning.ReturnBook();
        DeepKnowledge.ReturnBook();
        SystemDesigning.ReturnBook();
        }
    }


