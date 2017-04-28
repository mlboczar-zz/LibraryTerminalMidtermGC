import java.util.List;
import java.util.Scanner;

/**
 * Created by nickk, Megan, Marin on 4/26/2017.
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

    public void searchByAuthor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the keyword of the author of the book: ");
        String userInput = scan.nextLine();
        boolean bookFound = false;
        for (LibBooks x: books) {
            if (x.getAuthor().contains(userInput)) {
                System.out.println(x);
                bookFound = true;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found");
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
        if (!bookFound) {
            System.out.println("Book not found");
        }
    }

    public void selectABookToCheckOut() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the title of the book you would like to check out: ");
        String userInput = scan.nextLine();
        boolean bookFound = false;
        for (LibBooks bookToCheckOut : books) {
            if (bookToCheckOut.getTitle().equalsIgnoreCase(userInput)) {
                if (bookToCheckOut.getStatus()) {
                    System.out.println("You have checked out the book!");
                    bookToCheckOut.setStatus(false);
                    System.out.println(bookToCheckOut);
                    bookFound = true;
                } else {
                    System.out.println("This book is already checked out!");
                    bookFound = true;
                }
            }
        } if (!bookFound) System.out.println("Book not found");
    }

    public void returnABook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the title of the book you would like to return: ");
        String userInput = scan.nextLine();
        boolean bookFound = false;
        for (LibBooks bookToReturn : books) {
            if (bookToReturn.getTitle().equalsIgnoreCase(userInput)) {
                if (!bookToReturn.getStatus()) {
                    System.out.println("You have returned the book!");
                    bookToReturn.setStatus(true);
                    System.out.println(bookToReturn);
                    bookFound = true;
                } else {
                    System.out.println("This book is already on the shelf!");
                    bookFound = true;
                }
            }
        } if (!bookFound) System.out.println("Book not found");

    }

}
