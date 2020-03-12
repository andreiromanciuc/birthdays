package org.fasttrackit.birthdays.service;

import org.fasttrackit.birthdays.domain.Contact;
import org.fasttrackit.birthdays.persistance.ContactRepository;
import org.fasttrackit.birthdays.transfer.ContactTransfer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactService.class);

    private final ContactRepository contactRepository;
    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact createContact(ContactTransfer request) {
        LOGGER.info("Creating new user {}", request);
        Contact contact = new Contact();
        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setDate(request.getDate());
        contact.setPhone(request.getPhone());
        contact.setEmail(request.getEmail());
        contact.setFacebookAccount(request.getFacebookAccount());

        return contactRepository.save(contact);
    }

}
