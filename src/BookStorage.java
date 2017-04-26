import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Marin on 4/25/2017.
 */


public class BookStorage {

    public static void readFromFile() {

        // Will be using Enhanced for loop instead (for each)

//            for (int i = 0; i < books.length ; i++) {
//                out.println(books[i]);
//            }

        Path filePath = Paths.get("files/BookStorage.txt");
        File textFile = filePath.toFile();
        try {
            FileReader r = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(Scanner s) {
        System.out.println("Please enter the Title of the book: ");
        String title = s.nextLine();
        System.out.println("Please enter the Author of the book: ");
        String author = s.nextLine();
//        String status = s.nextLine();
//        String date = s.nextLine();

        LibBooks book = new LibBooks(title, author);
        Path testPath = Paths.get("files/BookStorage.txt");
        File testFiles = testPath.toFile();
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(testFiles, true));
            out.println(book);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//    BufferedReader in = new BufferedReader(new FileReader("path/of/text"));
//    String str;
//
//    List<String> list = new ArrayList<String>();
//    while((str = in.readLine()) != null){
//        list.add(str);
//        }
//
//        String[] stringArr = list.toArray(new String[0]);