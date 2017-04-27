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

    public void searchByAuthor() {
        System.out.println("Please enter the author of the book: ");
        String userInput = scan.nextLine();
        if (BookStorage.readFromFile().toString().contains(userInput)){
            System.out.println();
        }

    }

    public String searchByTitle() {
        System.out.println("Please enter a title keyword: ");
        String userInput = scan.nextLine();
        if (BookStorage.readFromFile().toString().contains(userInput)){
            System.out.println();
        }
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

    public void returnABook() {
        System.out.println("Please enter the title of the book you would like to return: ");
        String userInput = scan.nextLine();
        if (BookStorage.readFromFile(userInput).toString().contains(userInput) && Library.checkStatus(false)) {
            System.out.println("Book has been returned!");
            Library.checkStatus(true);
        }

    }
}
