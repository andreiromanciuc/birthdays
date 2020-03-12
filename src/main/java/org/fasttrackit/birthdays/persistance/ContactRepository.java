package org.fasttrackit.birthdays.persistance;

import org.fasttrackit.birthdays.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
