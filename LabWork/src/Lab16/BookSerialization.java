package Lab16;

import java.io.*;

// Define the Book class
class Book implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures class consistency during deserialization
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and toString() for display
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", Price: $" + price + "]";
    }
}

// Main class to demonstrate serialization and deserialization
public class BookSerialization {
    public static void main(String[] args) {
        String fileName = "book.ser"; // File to store serialized data

        // Create a Book object
        Book book = new Book("Effective Java", "Joshua Bloch", 45.99);

        // Serialize the Book object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(book);
            System.out.println("Serialization complete: " + book);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize the Book object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Book deserializedBook = (Book) ois.readObject();
            System.out.println("Deserialization complete: " + deserializedBook);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}

