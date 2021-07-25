package crud;

import java.util.ArrayList;

public class Book {
    private String name;
    private String id;
    private ArrayList<Author> authorsList;

    public Book(String name, ArrayList<Author> authorsList) {
        this.name = name;
        this.authorsList = authorsList;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthorsList() {
        return authorsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorsList(ArrayList<Author> authorsList) {
        this.authorsList = authorsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String authors = "";
        if (authorsList != null) {
            for (Author author : authorsList) {
                authors += author.getName() + " " + author.getSurname() + ",";
            }
        }
        return "Book{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", authorsList=" + authors +
                '}';
    }
}
