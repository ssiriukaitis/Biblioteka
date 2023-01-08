public class Main {
    public static void main(String[] args) {

        Book b = new Book();
        Author a = new Author();
        a.addBook(b);
        System.out.println(a.getBooks().size());



    }
}