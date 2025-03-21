package org.softwaredev.sdweek2lab.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hiring {

    private long id;
    private Book book;
    private User user;
    private Date receivedDate;
    private Date deliveryDate;

}
