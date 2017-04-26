import java.util.ArrayList;

/**
 * Created by Megan on 4/25/2017.
 */

public class UserInput {
    public static void diplayListOfBooks(){
        ArrayList<LibBooks> bookList = BookStorage.readFromFile(); // Will return an array list of LibBooks

    }

    public static void addBookToLibrary() {


    }

    public static void searchByAuthor() {


    }

    public static void searchByTitle() {


    }

    public static void selectABookToCheckOut() {
        Library.checkStatus(true);

    }

    public static void returnABook() {


    }
}
