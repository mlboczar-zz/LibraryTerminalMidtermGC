/**
 * Created by nickk on 4/26/2017.
 */
public class LibBooks {
        public enum Status {
            ON_SHELF,
            NOT_AVAILABLE
        }

        private final String title;
        private final String author;
        private Status status;


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

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }
    }


