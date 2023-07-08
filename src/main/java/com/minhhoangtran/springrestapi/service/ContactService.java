package com.minhhoangtran.springrestapi.service;

import java.util.List;

import com.minhhoangtran.springrestapi.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);

    List<Contact> getContacts();

    void saveContact(Contact contact);

    void updateContact(String id, Contact contact);

    void deleteContact(String id);

}
