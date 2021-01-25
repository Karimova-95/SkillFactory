package AnotherExercises.Library;

public class Book {
    public String nameOfBook;
    public String authorName;

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
