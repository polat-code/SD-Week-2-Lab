package org.softwaredev.sdweek2lab.services;

import org.softwaredev.sdweek2lab.request.HiringRequest;
import org.softwaredev.sdweek2lab.entities.Book;
import org.softwaredev.sdweek2lab.entities.Hiring;
import org.softwaredev.sdweek2lab.entities.User;
import org.softwaredev.sdweek2lab.repository.BookRepository;
import org.softwaredev.sdweek2lab.repository.HiringRepository;
import org.softwaredev.sdweek2lab.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class HiringManager {

    private final UserRepository userRepository;
    private final BookRepository bookRepository;
    private HiringRepository  hiringRepository;

    private static final int deliveryDay = 10;

    public HiringManager(HiringRepository hiringRepository, UserRepository userRepository, BookRepository bookRepository) {
        this.hiringRepository = hiringRepository;
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }

    public Hiring hireBook(Book book, User user) {
        Date receivedDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(receivedDate);
        calendar.add(Calendar.DAY_OF_MONTH, deliveryDay); // adds 10 days
        Date deliveryDate = calendar.getTime();

        return hiringRepository.addHirings(book, user,receivedDate,deliveryDate);
    }
    public String hireBook(HiringRequest hiringRequest) {
        User user = userRepository.findUserById(hiringRequest.userId());
        Book book = bookRepository.findById(hiringRequest.bookId());
        hireBook(book, user);
        return "Success";
    }
}
