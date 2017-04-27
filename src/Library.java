import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nickk on 4/26/2017.
 */
public class Library {

    private final List<LibBooks> books;

    public Library(List<LibBooks> books) {
        this.books = books;
    }

    public void printAllBooks() {
        for (LibBooks book : books) {
            System.out.println(book);
        }
    }

    public void searchByTitle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the keyword of the title of the book: ");
        String userInput = scan.nextLine();
        boolean bookFound = false;
        for (LibBooks x: books) {
            if (x.getTitle().contains(userInput)) {
                System.out.println(x);
                bookFound = true;
            }
        }
        if (bookFound == false) {
            System.out.println("Book not found");
        }
    }

    public void searchByAuthor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the keyword of the author of the book: ");
        String userInput = scan.nextLine();
        for (LibBooks x: books) {
            if (x.getAuthor().contains(userInput)) {
                System.out.println(x);
            }
        }
        System.out.println("Book not found");
    }

    public void selectABookToCheckOut() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the title of the book you would like to check out: ");
        String userInput = scan.nextLine();
        List <LibBooks> bookList = BookStorage.readFromFile();
        for (LibBooks x : bookList) {
            if (x.getStatus()) {
                if (x.getTitle().equalsIgnoreCase(userInput)) {
                    System.out.println("You have checked out the book!");
                    x.setStatus(false);
                }
            } else System.out.println("This book is already checked out!");
        }
    }

    public void returnABook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the title of the book you would like to return: ");
        String userInput = scan.nextLine();
        if (BookStorage.readFromFile().contains(userInput)) {
            System.out.println("Book has been returned!");
        }

    }

}
