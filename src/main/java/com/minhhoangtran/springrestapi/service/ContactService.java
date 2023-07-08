package com.minhhoangtran.springrestapi.service;

import com.minhhoangtran.springrestapi.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);

    void saveContact(Contact contact);

}
