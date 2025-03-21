package org.softwaredev.sdweek2lab.services;

import org.softwaredev.sdweek2lab.entities.Book;
import org.softwaredev.sdweek2lab.entities.Hiring;
import org.softwaredev.sdweek2lab.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("org.softwaredev")
public class LibraryManager {

  @Autowired private UserManager userManager;

  private BookManager bookManager;

  private HiringManager hiringManager;

  private EmailService emailService;

  public LibraryManager(HiringManager hiringManager, EmailService emailService) {
    this.hiringManager = hiringManager;
    this.emailService = emailService;
  }

  @Autowired
  public void setBookManager(BookManager bookManager) {
    this.bookManager = bookManager;
  }

  public void hireBook(long bookId, long userId) {
    User user = userManager.findUserById(userId);
    Book book = bookManager.findBookById(bookId);

    Hiring hiring = hiringManager.hireBook(book, user);

    System.out.println();
    emailService.sendEmail(book.getBookName(), user.getEmail());
    System.out.println();
    System.out.println(hiring);
    System.out.println();
    System.out.println(user);
    System.out.println();
    System.out.println(book);
    System.out.println();
  }
}
