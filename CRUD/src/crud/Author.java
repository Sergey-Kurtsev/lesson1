package crud;

import java.util.ArrayList;

public class Author {
    private String name;
    private String surname;
    private String id;
    private ArrayList<Book> booksList;

    public Author(String name, String surname, ArrayList<Book> booksList) {
        this.name = name;
        this.surname = surname;
        this.booksList = booksList;
    }
    public Author() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBooksList(ArrayList<Book> booksList) {
        this.booksList = booksList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", booksList=" + booksList +
                '}';
    }
}
