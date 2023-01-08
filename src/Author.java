import java.util.ArrayList;

public class Author {
    private int id;
    private String name;
    private String surname;
    private ArrayList<Book> books;

    public Author() {

        this.books = new ArrayList<>();

    }

    public Author(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.books = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }


}
