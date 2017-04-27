import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Megan on 4/25/2017.
 */
public class UserInput {
    Scanner scan = new Scanner(System.in);

    public static void printAllBooks() {
        ArrayList<LibBooks> readFromFile = BookStorage.readFromFile();
        for (int i = 0; i < readFromFile.size(); i++) {
            String b = readFromFile.get(i).getTitle();
            String a = readFromFile.get(i).getAuthor();
            System.out.println("\"" + b + "\"" + " by " + a);
        }
        BookStorage.readFromFile();
        System.out.println();
    }


    public void addABookToLibrary() {

    }


    public static String searchByTitle(ArrayList<LibBooks> bookList, Scanner scan) {
        System.out.println("Please enter the keyword of the title of the book: ");
        String userInput = scan.nextLine();
        for (LibBooks x: bookList) {
            if (x.getTitle().contains(userInput)) {
                System.out.println("Book was found");
                return String.valueOf(x);
            }
            System.out.println("Book not found");
        }
        return null;
    }

    public static String searchByAuthor(ArrayList<LibBooks> bookList, Scanner scan) {
        System.out.println("Please enter the keyword of the author of the book: ");
        String userInput = scan.nextLine();
        for (LibBooks x: bookList) {
            if (x.getAuthor().contains(userInput)) {
                System.out.println("Book was found");
                return String.valueOf(x);
            }
            System.out.println("Book not found");
        }
        return null;
    }

    public static void selectABookToCheckOut() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the title of the book you would like to check out: ");
        String userInput = scan.nextLine();
        if (BookStorage.readFromFile().toString().contains(userInput)) {
            if (Library.checkStatus(true)) {
                System.out.println("You have checked out the Book!");
                Library.checkStatus(false);
            }
            else if (Library.checkStatus(false)) {
                System.out.println("Book is already checked out!");
            }
        } else {
            System.out.println("Book not found, Please enter another book!");
        }

    }

    public static void returnABook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the title of the book you would like to return: ");
        String userInput = scan.nextLine();
        if (BookStorage.readFromFile().toString().contains(userInput)) {
            System.out.println("Book has been returned!");
            Library.checkStatus(true);
        }

    }
}