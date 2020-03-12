package org.fasttrackit.birthdays.persistance;

import org.fasttrackit.birthdays.domain.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {
}
