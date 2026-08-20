public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Title: \"%s\"\nAuthor: \"%s\"\nYear Published: %d\nPrice: $%.2f",
                title, author, yearPublished, price);
    }

    public static void main(String[] args) {
        Book myBook = new Book("1984", "George Orwell", 1949, 15.99);
        System.out.println(myBook);
    }
}
