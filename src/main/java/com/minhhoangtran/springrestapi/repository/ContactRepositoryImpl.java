package com.minhhoangtran.springrestapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.minhhoangtran.springrestapi.pojo.Contact;

@Repository
public class ContactRepositoryImpl implements ContactRepository {
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public Contact getContact(int index) {
        return contacts.get(index);
    }

    @Override
    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void updateContact(int index, Contact contact) {
        contacts.set(index, contact);
    }

    @Override
    public void deleteContact(int index) {
        contacts.remove(index);
    }

}
