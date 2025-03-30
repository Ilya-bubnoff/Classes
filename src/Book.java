import java.util.Objects;
public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;

    }

    public String toString() {
        return "Название " + title + "\nАвтор " + author + "\nГод публикации " + publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (other == null || other.getClass() != getClass())
            return false;
        Book otherBook = (Book) other;
        return title.equals(otherBook.title) &&
                author.equals(otherBook.author) &&
                publicationYear == otherBook.publicationYear;
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
