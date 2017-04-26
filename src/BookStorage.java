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

        BookTest bookTest = new BookTest();
        Path testPath = Paths.get("files/BookStorage.txt");
        File testFiles = testPath.toFile();
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(testFiles, true));

            // Will be using Enhanced for loop instead (for each)

//            for (int i = 0; i < books.length ; i++) {
//                out.println(books[i]);
//            }

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