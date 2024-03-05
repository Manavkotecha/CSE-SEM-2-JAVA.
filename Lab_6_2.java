import java.util.Scanner;

class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void displayPublication() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public void displayPublication() {
        super.displayPublication();
        System.out.println("Book Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public void displayPublication() {
        super.displayPublication();
        System.out.println("Paper Title: " + title);
    }
}

public class Lab_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter author's name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter publication type (book/paper): ");
        String publicationType = scanner.nextLine();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        scanner.close();
        Book publication;

        if (publicationType.equalsIgnoreCase("book")) {
            publication = new BookPublication(authorName, title);
        } else if (publicationType.equalsIgnoreCase("paper")) {
            publication = new PaperPublication(authorName, title);
        } else {
            System.out.println("Invalid publication type. Please specify 'book' or 'paper'.");
            return;

        }

        publication.displayPublication();

    }
}