package org.softwaredev.sdweek2lab.services;

import org.softwaredev.sdweek2lab.entities.Book;
import org.softwaredev.sdweek2lab.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookManager {

    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookById(long id) {
        return  bookRepository.findById(id);
    }
}
