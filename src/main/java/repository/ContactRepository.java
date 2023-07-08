package repository;

import java.util.List;

import pojo.Contact;

public interface ContactRepository {
    List<Contact> getContacts();

    Contact getContact(int index);

    void saveContact(Contact contact);

    void updateContact(int index, Contact contact);

    void deleteContact(int index);

}
