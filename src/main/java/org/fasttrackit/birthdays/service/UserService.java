package org.fasttrackit.birthdays.service;
import org.fasttrackit.birthdays.domain.User;
import org.fasttrackit.birthdays.persistance.UserRepository;
import org.fasttrackit.birthdays.transfer.CreateUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User createUser(CreateUser request) {
        LOGGER.info("Creating user {}",request);

        User user = new User(request.getUsername(), passwordEncoder.encode(request.getPassword()), "", "");

        return userRepository.save(user);
    }

}
