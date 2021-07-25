package crud.dao;
import crud.Author;
import crud.Book;

import java.util.List;

public interface AuthorDAO {
    void create(Author author);
    void update(Author author);
    void delete(String id);
    Author findById(String id);
    List<Author> findAll();
    List<Book> findBooksByAuthor(String id);
}
