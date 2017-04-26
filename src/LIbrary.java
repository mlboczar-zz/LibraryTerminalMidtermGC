import java.util.List;

/**
 * Created by nickk on 4/26/2017.
 */
public class LIbrary {
    private final List<LibBooks> books;

    public LIbrary(List<LibBooks> books) {
        this.books = books;
    }
    List<LibBooks> loadBooks () {
        books.add(new LibBooks("Java for Dummies","Antonella"));
        books.add(new LibBooks("Captain Underpants","Dav Pilkey"));
        books.add(new LibBooks("IT","Stephen King"));
        books.add(new LibBooks("To Kill a Mockingbird","Harper Lee"));
        books.add(new LibBooks("The Da Vinci Code","Dan Brown"));
        books.add(new LibBooks("A Tale of Two Cities","Charles Dickens"));
        books.add(new LibBooks("The Hobbit","J.R.R. Tolkien"));
        books.add(new LibBooks("Think and Grow Rich","Napolean Hill"));
        books.add(new LibBooks("Charlotte's Web","EB White"));
        books.add(new LibBooks("Catcher in the Rye","J.D. Salinger"));
        books.add(new LibBooks("Black Beauty","Anna Sewell"));
        books.add(new LibBooks("Gone with the Wind","Margaret Mitchell"));
        return books;
    }



    public boolean addBook(LibBooks books) {
        if (books != null && !books.equals("")) {
            throw new IllegalArgumentException("Must input a valid book!");
        }
        loadBooks().add(books);
        return true;
    }
    public LibBooks findByTitle (String title) {
        for (LibBooks x : books) {
            if (x.getTitle().equalsIgnoreCase(title)) ;
            return x;
        }
        return null;
    }
    public  LibBooks findByAuthor(String author) {
        for (LibBooks x:books){
            if(x.getAuthor().equalsIgnoreCase(author))
                return x;

        }
        return null;
    }




}
