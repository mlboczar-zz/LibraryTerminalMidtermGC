import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Megan on 4/25/2017.
 */
public class WelcomeMenu {

    public static int selectMenuOption() {
        System.out.println("Welcome to the Grand Circus Library!");
        Scanner scan = new Scanner(System.in);
        int userInput;
        do {
            displayOptions();
            userInput = scan.nextInt();
            if (userInput == 1) {

            } else if (userInput == 2) {

            } else if (userInput == 3) {

            } else if (userInput == 4) {

            } else if (userInput == 5) {

            } else if (userInput == 6) {

            } else if (userInput == 7) {

            } else System.out.println("That is not a valid option. Please select option 1-6");
        } while (userInput != 7);
        return userInput;
    }

    private static void displayOptions() {
        System.out.println("Please select one of the following options: ");
        System.out.println("1 - Display a list of books in the library");
        System.out.println("2 - Add a book to the library");
        System.out.println("3 - Search for a book by author");
        System.out.println("4 - Search for a book by title keyword");
        System.out.println("5 - Select a book from the list to check out");
        System.out.println("6 - Return a book");
        System.out.println("7 - Quit");
    }

}
