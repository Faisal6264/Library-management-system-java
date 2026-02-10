
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Book {

    Scanner sc = new Scanner(System.in);
    String[] books = {"Algorithms", "Operating Systems", "DBMS", "Computer Networks",
        "AI", "Data Structures", "C Programming", "Java OOP", "Software Engineering", "COA"};
    ArrayList<String> availableBooks = new ArrayList<>(Arrays.asList(books));
    ArrayList<String> issuedBook = new ArrayList<>();
    String book;

    void issueBook() {
        System.out.print("Enter book name:- ");
        book = sc.nextLine();
        if (availableBooks.contains(book)) {
            availableBooks.remove(book);
            issuedBook.add(book);
            System.out.println(book + " is issued successfully.");
        } else {
            System.out.println(book + " is not available.");
        }
    }

    void returnBook() {
        System.out.print("Enter book name:- ");
        book = sc.nextLine();
        if (issuedBook.contains(book)) {
            issuedBook.remove(book);
            availableBooks.add(book);
        } else {
            System.out.println(book + " is not issued yet!");
        }

    }

    void availableBook() {
        System.out.println(availableBooks);
    }

    void addBook() {
        System.out.print("Enter book name to add:- ");
        book = sc.nextLine();
        availableBooks.add(book);
        System.out.print("Book add sucessfully.");
    }
}

public class Library {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book obj = new Book();
        int num = 0;
        System.out.printf(
                "1. Check available books\n"
                + "2. Issue a book\n"
                + "3. Return a book\n"
                + "4. Add a book\n"
                + "5. Exit\n"
        );

        while (true) {
            System.out.print("Enter number from 1 to 5:- ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    obj.availableBook();
                    break;
                case 2:
                    obj.issueBook();
                    break;
                case 3:
                    obj.returnBook();
                    break;
                case 4:
                    obj.addBook();
                    break;
                case 5:
                    System.out.println("Thank You for using our services.");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
