import java.util.ArrayList;
public class Library {
    ArrayList<Book> Book = new ArrayList<>();

    void addBook(Book book){
        Book.add(book);
    }

    void viewBooks(){
        for(Book b : Book){
            System.out.println(b.name);
        }
    }

    
}
