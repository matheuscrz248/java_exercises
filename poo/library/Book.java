package poo.library;

public class Book {
    private final String author, title;
    private int year;
    private static int totalBooks = 0;
    private boolean isAvailable;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        totalBooks++;
        isAvailable = true;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }



}
