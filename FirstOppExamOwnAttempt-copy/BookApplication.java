import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BookApplication {
    private static ArrayList<Book> books;

    public static void main(String[] args) {
        books = readFile("books.txt");

        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book.getBooksList());
        }

        System.out.println();
        System.out.println("Size information:");
        for (Book book : books) {
            System.out.println(book.getSizeDetails());
        }

        System.out.println();
        System.out.println("Weight of PrintBooks:");
        for (Book book : books) {
            if (book instanceof PrintBook) {
                PrintBook printBook = (PrintBook) book;
                System.out.println(printBook.getBookWeight());
            }
        }
    }

    private static ArrayList<Book> readFile(String filename) {
        books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("#");

                if (values.length >= 5) {
                    String isbn = values[2];

                    if (isbn.matches("\\d{9}[0-9X]")) {
                        if (isbn.startsWith("1")) {
                            String title = values[0];
                            String author = values[1];
                            int size = Integer.parseInt(values[3]);

                            EBook eBook = new EBook(title, author, isbn, size);
                            books.add(eBook);
                        } else if (isbn.startsWith("0")) {
                            String title = values[0];
                            String author = values[1];
                            int pages = Integer.parseInt(values[3]);
                            double weight = Double.parseDouble(values[4]);

                            PrintBook printBook = new PrintBook(title, author, isbn, pages, weight);
                            books.add(printBook);
                        } else {
                            System.out.println("Invalid ISBN: " + isbn);
                        }
                    } else {
                        System.out.println("Invalid ISBN: " + isbn);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        return books;
    }
}
