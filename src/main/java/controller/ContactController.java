package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.ContactService;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

}
