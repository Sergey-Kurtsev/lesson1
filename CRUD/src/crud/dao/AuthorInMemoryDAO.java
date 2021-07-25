package crud.dao;

import crud.Author;
import crud.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AuthorInMemoryDAO implements AuthorDAO {
    private List<Author> authors = new ArrayList<>();

    @Override
    public void create(Author author) {
        author.setId(generateId());
        authors.add(author);
    }

    @Override
    public void update(Author author) {
        for (Author a : authors) {
            if (a.getId().equals(author.getId())) {
                a.setName(author.getName());
                a.setSurname(author.getSurname());
                break;
            }
        }

    }

    @Override
    public void delete(String id) {
        authors.removeIf(author1 -> author1.getId().equals(id));
    }

    @Override
    public Author findById(String id) {
        for (Author a : authors) {
            if (a.getId().equals(id))
                return a;
        }
        return null;
    }

    @Override
    public List<Author> findAll() {
        return authors;
    }

    @Override
    public List<Book> findBooksByAuthor(String id) {
        for (Author a : authors) {
            if (a.getId().equals(id)) {
                return a.getBooksList();
            }
        }
        return null;
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        return id;
    }
}
