/**
 * Created by nickk on 4/26/2017.
 */
public class LibBooks {

    private final String title;
    private final String author;
    private String status;


    public LibBooks(String title, String author) {
        this.title = title;
        this.author = author;

    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return title + "," + author + "," + status;
    }
}


