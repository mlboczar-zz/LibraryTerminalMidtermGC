import java.util.Scanner;

/**
 * Created by Megan on 4/25/2017.
 */


public class MainLibraryApp {
    public static void main(String[] args) {
        WelcomeMenu.selectMenuOption();

        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);
        BookStorage.writeToFile(scan);
    }
}
