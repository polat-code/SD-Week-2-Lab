package org.softwaredev.sdweek2lab.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String schoolNumber;

}
