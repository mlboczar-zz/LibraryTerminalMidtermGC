/**
 * Created by nickk on 4/26/2017.
 */
public class LibBooks {

    private  String title;
    private  String author;
    private boolean status;



    public LibBooks(String title, String author) {
        this.title = title;
        this.author = author;

    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Title:\t" + title + "\t Author: " + author + "\t Status: " + status  + "On Shelf" + "\t Due Date:" + "2 Weeks from now";
    }
}


