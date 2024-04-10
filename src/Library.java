import java.util.ArrayList;

public class Library
{

    private ArrayList<Book> Books;
    {
        this.Books = new ArrayList<>();
    }

    /**
     * Adds a book to the library's collection of books
     * @param aBook the book to add to the library
     */
    public void addBook(Book aBook)
    {
        this.Books.add(aBook);
    }
    /**
     * Lists all the books in the library
     */
    public void listBooks()
    {
        for (Book b : this.Books)
        {
            System.out.println(b);
        }
    }
}
