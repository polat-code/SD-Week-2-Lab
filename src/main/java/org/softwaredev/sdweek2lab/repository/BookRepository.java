package org.softwaredev.sdweek2lab.repository;

import org.softwaredev.sdweek2lab.entities.Book;
import org.softwaredev.sdweek2lab.exception.BookNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {

  private List<Book> books = new ArrayList<>();

  public BookRepository() {
    // Suppose all data comes from database
    books.add(
        createBook(
            1L,
            "To Kill a Mockingbird",
            "Harper Lee",
            "A novel exploring racism and injustice in the Deep South."));
    books.add(
        createBook(
            2L,
            "1984",
            "George Orwell",
            "A dystopian novel about surveillance and totalitarianism."));
    books.add(
        createBook(
            3L,
            "Pride and Prejudice",
            "Jane Austen",
            "A classic novel of manners, love, and social standing."));
    books.add(
        createBook(
            4L,
            "The Great Gatsby",
            "F. Scott Fitzgerald",
            "A tragic story of wealth and the American dream."));
    books.add(
        createBook(5L, "Moby Dick", "Herman Melville", "An epic tale of obsession and the sea."));
    books.add(
        createBook(
            6L,
            "War and Peace",
            "Leo Tolstoy",
            "An expansive narrative of Russian society during the Napoleonic era."));
    books.add(
        createBook(
            7L,
            "The Catcher in the Rye",
            "J.D. Salinger",
            "A story capturing adolescent alienation and identity."));
    books.add(
        createBook(
            8L,
            "The Hobbit",
            "J.R.R. Tolkien",
            "A fantasy adventure leading up to the events of The Lord of the Rings."));
    books.add(
        createBook(
            9L,
            "Crime and Punishment",
            "Fyodor Dostoevsky",
            "A deep dive into morality and redemption in 19th-century Russia."));
    books.add(
        createBook(
            10L,
            "Brave New World",
            "Aldous Huxley",
            "A visionary novel about a controlled, dystopian future."));
  }

  public List<Book> findAll() {
    return books;
  }

  private Book createBook(long id, String bookName, String bookAuthor, String bookDescription) {
    return Book.builder()
        .id(id)
        .bookName(bookName)
        .bookAuthor(bookAuthor)
        .bookDescription(bookDescription)
        .build();
  }

  public Book findById(long id) {
    Optional<Book> bookOptional =
        books.stream().filter(book -> book.getId() == id).findFirst();
    return bookOptional.orElseThrow(() -> new BookNotFoundException("Book Not Found Exception"));
  }
}
