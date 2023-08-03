package constructors;

import java.util.Scanner;

class TestBook {
    public static void main(String[] args) {
        BookDetails book1 = new BookDetails();
        book1.displayDetails();
        BookDetails book2 = new BookDetails("String pool", "Kamran Babayev", 2023, 30);
        book2.displayDetails();
        book2.updateBookDetails();
        book2.displayDetails();
    }
}

public class BookDetails {
    private String title;
    private String author;
    private int yearPublished;
    private int pageCount;

    public BookDetails() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.yearPublished = 0;
        this.pageCount = 0;
    }

    public BookDetails(String title, String author, int yearPublished, int pageCount) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }

    public void updateBookDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new title: ");
        String newTitle = sc.nextLine();
        System.out.println("Enter new author name: ");
        String newAuthor = sc.nextLine();
        System.out.println("Enter new published year: ");
        int newYear = sc.nextInt();
        System.out.println("Enter new page count: ");
        int newPageCount = sc.nextInt();
        this.title = newTitle;
        this.author = newAuthor;
        this.yearPublished = newYear;
        this.pageCount = newPageCount;
        System.out.println("Book updated successfully");
    }

    public void displayDetails() {
        System.out.println("Title = " + title + ", Author = " + author + ", Year published = " + yearPublished + ", Page count = " + pageCount);
    }


}
