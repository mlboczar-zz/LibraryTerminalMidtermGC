/**
 * Created by nickk on 4/26/2017.
 */
public class LibBooks {

    private String title;
    private String author;
    private boolean status = true;


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
        StringBuilder sb = new StringBuilder();
        sb.append("Title: " + title + "\t Author: " + author + "\t Status: ");
        if (status) {
            sb.append("On Shelf");
        } else {
            sb.append("Checked Out \tDue Date: Two weeks from now");
        } return sb.toString();
    }
}