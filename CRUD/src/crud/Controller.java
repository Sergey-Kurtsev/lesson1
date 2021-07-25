package crud;

import crud.dao.AuthorDAO;
import crud.dao.AuthorInMemoryDAO;
import crud.dao.BookDAO;
import crud.dao.BookInMemoryDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Controller {
    private final BookDAO bookDAO = new BookInMemoryDAO();
    private final AuthorDAO authorDAO = new AuthorInMemoryDAO();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your option");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0")) {
                    System.exit(0);
                }
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1":
                createBook(reader);
                break;
            case "2":
                updateBook(reader);
                break;
            case "3":
                deleteBook(reader);
                break;
            case "4":
                findBookById(reader);
                break;
            case "5":
                findAllBooks(reader);
                break;
            case "6":
                createAuthor(reader);
                break;
            case "7":
                findAllAuthors();
                break;
            case "8":
                findAuthorById(reader);
                break;
            case "9":
                updateAuthor(reader);
                break;
            case "10":
                deleteAuthor(reader);
                break;
            case "11":
                findBookByAuthor(reader);
                break;
            case "12":
                findAuthorsByBook(reader);
                break;
        }
        runNavigation();
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want create book, please enter 1");
        System.out.println("if you want update book, please enter 2");
        System.out.println("if you want delete book, please enter 3");
        System.out.println("if you want findById book, please enter 4");
        System.out.println("if you want findAll book, please enter 5");
        System.out.println("if you want create author, please enter 6");
        System.out.println("if you want findAll authors, please enter 7");
        System.out.println("if you want findById author, please enter 8");
        System.out.println("if you want update author, please enter 9");
        System.out.println("if you want delete author, please enter 10");
        System.out.println("if you want find book by author, please enter 11");
        System.out.println("if you want find authors by book, please enter 12");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void createBook(BufferedReader reader) {
        try {
            System.out.println("Please, enter the name of a book");
            String name = reader.readLine();
            System.out.println("Enter number of authors");
            Book book = new Book(name, null);
            int numberOfAuthors = Integer.parseInt(reader.readLine());
            ArrayList<Author> authorList = new ArrayList<>();
            for (int i = 0; i < numberOfAuthors; i++) {
                System.out.println("Please, enter author's name");
                Author author = new Author();
                author.setName(reader.readLine());
                System.out.println("Please, enter author's surname");
                author.setSurname(reader.readLine());
                ArrayList<Book> bookList = new ArrayList<>();
                bookList.add(book);
                author.setBooksList(bookList);
                authorDAO.create(author);
                authorList.add(author);
            }
            book.setAuthorsList(authorList);
            bookDAO.create(book);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateBook(BufferedReader reader) {
        try {
            System.out.println("Please add book id");
            String id = reader.readLine();
            System.out.println("Please add new name");
            String name = reader.readLine();
            Book book = new Book();
            book.setName(name);
            book.setId(id);
            bookDAO.update(book);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteBook(BufferedReader reader) {
        try {
            System.out.println("Please add book id");
            String id = reader.readLine();
            bookDAO.delete(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findBookById(BufferedReader reader) {
        try {
            System.out.println("Please enter book id");
            String id = reader.readLine();
            Book book = bookDAO.findById(id);
            System.out.println(book);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findAllBooks(BufferedReader reader) {
        System.out.println(bookDAO.findAll());
    }

    private void createAuthor(BufferedReader reader) {
        Author author = new Author();
        try {
            System.out.println("Please, enter author's name");
            author.setName(reader.readLine());
            System.out.println("Please, enter author's surname");
            author.setSurname(reader.readLine());
            System.out.println("Please, enter a number of books");
            int booksNumber = Integer.parseInt(reader.readLine());
            ArrayList<Book> booksList = new ArrayList<>();
            for (int i = 0; i < booksNumber; i++) {
                Book book = new Book();
                System.out.println("Please enter book name");
                book.setName(reader.readLine());
                booksList.add(book);
                ArrayList<Author> authorList = new ArrayList<>();
                authorList.add(author);
                book.setAuthorsList(authorList);
                bookDAO.create(book);
            }
            author.setBooksList(booksList);
            authorDAO.create(author);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findAllAuthors() {
        System.out.println(authorDAO.findAll());
    }

    private void findAuthorById(BufferedReader reader) {
        try {
            System.out.println("Enter Author's id");
            System.out.println(authorDAO.findById(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateAuthor(BufferedReader reader) {
        try {
            System.out.println("Please, enter author's id");
            Author author = new Author();
            author.setId(reader.readLine());
            System.out.println("Please, enter author's name");
            author.setName(reader.readLine());
            System.out.println("Please, enter author's surname");
            author.setSurname(reader.readLine());
            authorDAO.update(author);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteAuthor(BufferedReader reader) {
        try {
            System.out.println("Enter Author's id");
            authorDAO.delete(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findBookByAuthor(BufferedReader reader) {
        try {
            System.out.println("Please, enter an author's id");
            System.out.println(authorDAO.findBooksByAuthor(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findAuthorsByBook(BufferedReader reader) {
        try {
            System.out.println("Please, enter an id of a book");
            System.out.println(bookDAO.findAuthorsByBook(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
