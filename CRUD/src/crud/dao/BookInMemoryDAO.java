package crud.dao;

import crud.Author;
import crud.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookInMemoryDAO implements BookDAO {
    private List<Book> books = new ArrayList<>();

    @Override
    public void create(Book book) {
        book.setId(generateId());
        books.add(book);
    }

    @Override
    public void update(Book book) {
        for (Book a : books) {
            if (a.getId().equals(book.getId())) {
                a.setName(book.getName());
                break;
            }
        }
    }

    @Override
    public void delete(String id) {
    books.removeIf(book1 -> book1.getId().equals(id));
    }

    @Override
    public Book findById(String id) {
        for (Book a : books) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public List<Author> findAuthorsByBook(String id) {
        Book book = findById(id);
        if (book != null) {
            return book.getAuthorsList();
        }
        return null;
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        return id;
    }
}
