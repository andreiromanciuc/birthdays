package org.fasttrackit.birthdays.service;
import org.fasttrackit.birthdays.domain.User;
import org.fasttrackit.birthdays.persistance.UserRepository;
import org.fasttrackit.birthdays.transfer.UserTransfer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserTransfer request) {
        LOGGER.info("Creating user {}",request);
        User user = new User();
        user.setUserEmail(request.getUserEmail());
        user.setPassword(request.getPassword());
        user.setRepeatPassword(request.getRepeatPassword());
        return userRepository.save(user);
    }

}
