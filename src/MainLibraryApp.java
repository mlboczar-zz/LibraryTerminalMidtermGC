import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Megan on 4/25/2017.
 */


public class MainLibraryApp {
    public static void main(String[] args) {

//        WelcomeMenu.selectMenuOption();

        Scanner scan = new Scanner(System.in);
//        BookStorage.writeToFile(scan);

        ArrayList<LibBooks> library = BookStorage.readFromFile();
        for (int i = 0; i < library.size(); i++) {
            String title = library.get(i).getTitle();
            String author = library.get(i).getAuthor();
            System.out.println("\"" + title + "\"" + author);
        }
        BookStorage.readFromFile();
        System.out.println();
        UserInput.searchByTitle(library, scan);
        UserInput.searchByAuthor(library, scan);

    }
}
