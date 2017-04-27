import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Megan on 4/25/2017.
 */
public class UserInput {
    Scanner scan = new Scanner(System.in);
    public void printAllBooks() {
        ArrayList<books> readFromFile = BookStorage.readFromFile();
        for (int i = 0; i < books.size(); i++) {
            String a = readFromFile.get(i).getAuthor;
            String t = readFromFile.get(i).getTitle;
            System.out.println(t + " written by " + a);
        }
        }
    }

    public void addABookToLibrary() {

    }

    public void searchByAuthor() {
        System.out.println("Please enter the author of the book: ");
        String userInput = scan.nextLine();
        if (BookStorage.readFromFile(userInput).toString().contains(userInput)){
            System.out.println();
        }

    }

    public String searchByTitle() {
        System.out.println("Please enter a title keyword: ");
        String userInput = scan.nextLine();
        if (BookStorage.readFromFile(userInput).toString().contains(userInput)){
            System.out.println();
        }
    }

    public static void selectABookToCheckOut() {
        System.out.println("Please enter the title of the book you would like to check out: ");

    }

    public static void returnABook() {
        System.out.println("Please enter the title of the book you would like to return: ");

    }
}
