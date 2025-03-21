package org.softwaredev.sdweek2lab.services;

import org.softwaredev.sdweek2lab.entities.Book;

public class EmailService {

    public void sendEmail(String bookName, String email) {
    System.out.println("Book :  " + bookName + " has been recieved to " + email);
    }
}
