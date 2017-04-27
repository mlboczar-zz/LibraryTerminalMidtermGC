import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Marin on 4/25/2017.
 */


public class BookStorage {

    public static ArrayList<LibBooks> readFromFile() {
        ArrayList<LibBooks> books = new ArrayList<LibBooks>();

        Path filePath = Paths.get("files/BookStorage.txt");
        File file = filePath.toFile();
        try {
            FileReader r = new FileReader(file);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();
                while (line != null) {

                    String[] book = line.split(",");
                    LibBooks bookObject = new LibBooks(book[0], book[1]);
                    books.add(bookObject);

                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }
}

