package crud.dao;
import crud.Author;
import crud.Book;

import java.util.List;

public interface BookDAO {
    void create(Book book);
    void update(Book book);
    void delete(String id);
    Book findById(String id);
    List<Book> findAll();
    List<Author> findAuthorsByBook(String id);
}
