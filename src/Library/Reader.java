package Library;

import java.time.LocalDate;

public class Reader {
    private String name;
    private static int id;
    private String faculty;
    private LocalDate bday;
    private long phone;

    public Reader(String name, String faculty, LocalDate bday, long phone) {
        this.name = name;
        this.faculty = faculty;
        this.bday = bday;
        this.phone = phone;
        int libId = id;
        id++;
    }

    public void takeBook(int kol) {
        System.out.println(name + " взял " + kol + " книги");
    }

    public void takeBook(String... arr) {
        System.out.print(name + " взял книги: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + ".");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public void takeBook(Book... book) {
        System.out.println(name + " взял книги: ");
        for (int i = 0; i < book.length; i++) {
            if (i == book.length - 1) {
                System.out.print(book[i].nameOfBook + ".");
            } else {
                System.out.print(book[i].nameOfBook + ", ");
            }
        }
    }


    public void returnBook(int kol) {
        System.out.println(name + " вернул " + kol + " книги");
    }

    public void returnBook(String... arr) {
        System.out.print(name + " вернул книги: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + ".");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public void returnBook(Book... book) {
        System.out.println(name + " вернул книги: ");
        for (int i = 0; i < book.length; i++) {
            if (i == book.length - 1) {
                System.out.print(book[i].nameOfBook + ".");
            } else {
                System.out.print(book[i].nameOfBook + ", ");
            }
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", bday=" + bday +
                ", phone=" + phone +
                '}';
    }
}
