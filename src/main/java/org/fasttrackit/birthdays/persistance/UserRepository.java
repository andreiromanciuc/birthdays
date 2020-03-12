package org.fasttrackit.birthdays.persistance;

import org.fasttrackit.birthdays.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
