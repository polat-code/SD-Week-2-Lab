package org.softwaredev.sdweek2lab.services;

import org.softwaredev.sdweek2lab.entities.User;
import org.softwaredev.sdweek2lab.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserManager {

    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(long id) {
        return userRepository.findUserById(id);
    }
}
