package AnotherExercises.Library;

public class Book {
    public final String nameOfBook;
    public final String authorName;

    public Book(String nameOfBook, String authorName) {
        this.nameOfBook = nameOfBook;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
