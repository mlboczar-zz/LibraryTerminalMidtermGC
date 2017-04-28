import java.util.Scanner;

/**
 * Created by Megan, Marin, Nick on 4/25/2017.
 */

public class MainLibraryApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the MNM Library!"
                + "\n---------------------------");
        Scanner scan = new Scanner(System.in);
        Library library = new Library(BookStorage.readFromFile());
        int userInput;
        do {
            //Implementing Validator class: github.com/grandcircusco/java_april2017/tree/master/Resources
            userInput = Validator.getInt(scan,
                    "Please select one of the following options:"
                            + "\n1 - Display a list of books in the library"
                            + "\n2 - Search for a book by author"
                            + "\n3 - Search for a book by title keyword"
                            + "\n4 - Select a book from the list to check out"
                            + "\n5 - Return a book"
                            + "\n6 - Quit\n"
                    , 1, 6);
            if (userInput == 1) {
                library.printAllBooks();
            } else if (userInput == 2) {
                library.searchByAuthor();
            } else if (userInput == 3) {
                library.searchByTitle();
            } else if (userInput == 4) {
                library.selectABookToCheckOut();
            } else if (userInput == 5) {
                library.returnABook();
            } else if (userInput == 6) {
                System.out.println("Thanks for visiting our library!");
            }
        } while (userInput != 6);
    }
}