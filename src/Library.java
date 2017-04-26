import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by nickk on 4/26/2017.
 */
public class Library {


    private final List<LibBooks> books;

    public Library(List<LibBooks> books) {
        this.books = books;
    }

    List<LibBooks> loadBooks() {
        books.add(new LibBooks("Java for Dummies", "Antonella"));
        books.add(new LibBooks("Captain Underpants", "Dav Pilkey"));
        books.add(new LibBooks("IT", "Stephen King"));
        books.add(new LibBooks("To Kill a Mockingbird", "Harper Lee"));
        books.add(new LibBooks("The Da Vinci Code", "Dan Brown"));
        books.add(new LibBooks("A Tale of Two Cities", "Charles Dickens"));
        books.add(new LibBooks("The Hobbit", "J.R.R. Tolkien"));
        books.add(new LibBooks("Think and Grow Rich", "Napolean Hill"));
        books.add(new LibBooks("Charlotte's Web", "EB White"));
        books.add(new LibBooks("Catcher in the Rye", "J.D. Salinger"));
        books.add(new LibBooks("Black Beauty", "Anna Sewell"));
        books.add(new LibBooks("Gone with the Wind", "Margaret Mitchell"));
        return books;
    }


    public boolean addBook(LibBooks books) {
        if (books != null && !books.equals("")) {
            throw new IllegalArgumentException("Must input a valid book!");
        }
        loadBooks().add(books);
        return true;
    }

    public LibBooks findByTitle(String title) {
        for (LibBooks x : books) {
            if (x.getTitle().equalsIgnoreCase(title)) ;
            return x;
        }
        return null;
    }

    public LibBooks findByAuthor(String author) {
        for (LibBooks x : books) {
            if (x.getAuthor().equalsIgnoreCase(author))
                return x;

        }
        return null;
    }

    public static LibBooks checkStatus(Boolean status) {
        if (status) {
            System.out.println("On Shelf");

        } else if (status != true) {
            System.out.println("Unavailable");
        }
        return null;
    }
    //    private int dueDate;
//    private String checkoutDate;
//    private String bookStatus;


//    public int getDueDate() {
//        return dueDate;
//    }

//    public void setDueDate(int dueDate) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Calendar c = Calendar.getInstance();
//        c.setTime(new Date()); // Now use today date.
//        c.add(Calendar.DATE, 14); // Adding 5 days
//        String output = sdf.format(c.getTime());
//        System.out.println(output);
//        this.dueDate = dueDate;
//}

//    public String getCheckoutDate() {
//        return checkoutDate;
//    }
//
//    public void setCheckoutDate(String checkoutDate) {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        LocalDate localDate = LocalDate.now();
//        System.out.println(dtf.format(localDate));
//        this.checkoutDate = checkoutDate;
//    }


}
