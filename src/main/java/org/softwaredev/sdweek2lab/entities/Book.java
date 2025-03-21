package org.softwaredev.sdweek2lab.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    private long id;
    private String bookName;
    private String bookAuthor;
    private String bookDescription;
}
