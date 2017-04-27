import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Marin on 4/25/2017.
 */


public class BookStorage {

    public static ArrayList<LibBooks> readFromFile(){
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
                    LibBooks bookObject = new LibBooks(book[0],book[1]);
                    books.add (bookObject);

//                    for (int i = 0; i < books.size(); i++) {
//                        LibBooks L = books.get(i);
//                    }
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

    public static void writeToFile(Scanner s) {
//          This part is being sunsetted, we don't need the input to be here
//          System.out.println("Please enter the Title of the book: ");
//          System.out.println("Please enter the Author of the book: ");

////        String status = s.nextLine();
////        String date = s.nextLine();

        String title = s.nextLine();
        String author = s.nextLine();

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

// Will be using Enhanced for loop instead (for each)

//            for (int i = 0; i < books.length ; i++) {
//                out.println(books[i]);
//            }

//        Path filePath = Paths.get("files/BookStorage.txt");
//        File textFile = filePath.toFile();

//            try {
//                FileReader r = new FileReader(textFile);
//                BufferedReader input = new BufferedReader(r);
//                String line = input.readLine();
//                // for each line
//
//                input.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//                System.exit(1);
//                return null;
//            }
//            System.out.println(books);
//        }
//    }

//    BufferedReader in = new BufferedReader(new FileReader("path/of/text"));
//    String str;
//
//    List<String> list = new ArrayList<String>();
//    while((str = in.readLine()) != null){
//        list.add(str);
//        }
//
//        String[] stringArr = list.toArray(new String[0]);