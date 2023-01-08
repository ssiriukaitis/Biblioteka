import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(Author.counter);
        Book b = new Book();
        Author a = new Author();
        a.addBook(b);
        System.out.println(a.getBooks().size());
        System.out.println(a);

        ArrayList<Author> Authors = new ArrayList<>();

        System.out.println(Author.counter);
        Author a2 = new Author();
        System.out.println(Author.counter);
        System.out.println(a2);




    }
}