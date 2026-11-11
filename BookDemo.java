import java.util.Scanner;

class Book {
    int book_id;
    String title;
    String author;
    double price;

    static int totalBooks = 0;

  

    Book(int book_id, String title, String author, double price) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

   
    void display() {
        System.out.println("Book ID : " + book_id);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
        
    }

  void search(int id) {
    if (book_id == id) {
        System.out.println("Book found by ID:");
        display();
    } else {
        System.out.println("Book not found.");
    }
}

    
    void search(String bookTitle) {
        if (title.equalsIgnoreCase(bookTitle)) {
            System.out.println("Book found by Title:");
            display();
        } else {
            System.out.println("Book not found.");
        }
    }

    
    Book costlierBook(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
    }
}

public class BookDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book books[] = new Book[n];

   
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(id, title, author, price);
        }

        // Display all books
        System.out.println("\n--- All Book Details ---");
        for (Book b : books) {
            b.display();
        }

        // Search by book ID
        System.out.print("Enter book ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Book b : books) {
            b.search(id);
        }

        sc.close();
    }}
