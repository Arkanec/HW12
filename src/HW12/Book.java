package HW12;

public class Book {
    private String bookName;
    private int publicationYear;
    private Author author;
    public Book(String bookName, int publicationYear, Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
