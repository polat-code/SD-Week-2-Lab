package org.softwaredev.sdweek2lab.repository;

import org.softwaredev.sdweek2lab.entities.User;
import org.softwaredev.sdweek2lab.exception.UserNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

  private List<User> users = new ArrayList<>();

  public UserRepository() {
    // Suppose all data comes from database
    users.add(createUser(1L, "Ali", "Polat", "alip233@gmail.com", "123456", "254234035"));
    users.add(createUser(2L, "Ahmet", "Durmaz", "ahmetd12@gmail.com", "d12d12", "254260034"));
    users.add(createUser(3L, "Fatma", "Albora", "alboraFa@gmail.com", "faAlbora02", "2729298111"));
    users.add(createUser(4L, "Ayşe", "Boralı", "aysebrl233@gmail.com", "123456", "29264435"));
    users.add(createUser(5L, "Mehmet", "Martak", "martakmehh@gmail.com", "123456", "214394021"));
    users.add(createUser(6L, "Kadir", "Bolulu", "kadirrr23@gmail.com", "23342", "736233232"));
    users.add(createUser(7L, "Fatih", "Dolkan", "dolkanfaith@gmail.com", "9283332", "98734123"));
  }

  public List<User> findAll() {
    return users;
  }

  private User createUser(
      long id, String name, String surname, String email, String password, String schoolNumber) {
    return User.builder()
        .id(id)
        .name(name)
        .surname(surname)
        .email(email)
        .password(password)
        .schoolNumber(schoolNumber)
        .build();
  }

  public User findUserById(long id) {
    Optional<User> user = users.stream().filter(u -> u.getId() == id).findFirst();
    if (user.isEmpty()) {
      throw new UserNotFoundException("User with id " + id + " not found");
    }
    return user.get();
  }
}
