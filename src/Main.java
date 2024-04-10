// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book b = new Book(  "Kyle",  "Java programmming ",  "9782329392");

        System.out.println(b.getTitle());

        System.out.println(b.IsOnLoan());

        System.out.println(b);
        b.setOnLoan(true);
        System.out.println(b);
    }
}