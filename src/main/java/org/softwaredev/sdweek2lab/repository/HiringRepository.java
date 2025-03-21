package org.softwaredev.sdweek2lab.repository;

import org.softwaredev.sdweek2lab.entities.Book;
import org.softwaredev.sdweek2lab.entities.Hiring;
import org.softwaredev.sdweek2lab.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class HiringRepository {

  private List<Hiring> hirings;
  private long idCounter = 1L;


    public HiringRepository() {
      // Suppose all data comes as empty list from database
        this.hirings = new ArrayList<>();
    }

    public Hiring addHirings(Book book, User user, Date receivedDate, Date deliveryDate) {
    Hiring hiring =
        Hiring.builder()
            .id(idCounter++)
            .book(book)
            .user(user)
            .receivedDate(receivedDate)
            .deliveryDate(deliveryDate)
            .build();
    hirings.add(hiring);
    return hiring;
  }

  public List<Hiring> findAllHirings() {
    return hirings;
  }
}
