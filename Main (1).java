import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------");
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== Library Catalog Tool =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books.add(new Book(title, author));

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:

                    if(books.isEmpty()) {
                        System.out.println("No Books Available!");
                    } else {
                        for(Book b : books) {
                            b.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book Title: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for(Book b : books) {
                        if(b.title.equalsIgnoreCase(search)) {
                            b.display();
                            found = true;
                        }
                    }

                    if(!found) {
                        System.out.println("Book Not Found!");
                    }

                    break;

                case 4:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}