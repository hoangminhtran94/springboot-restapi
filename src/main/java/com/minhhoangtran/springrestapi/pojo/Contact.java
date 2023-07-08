package com.minhhoangtran.springrestapi.pojo;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;

public class Contact {
    private String id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Phone number cannot be blank")
    @Length(min = 10, max = 10, message = "Phone number must be 10 characters")
    private String phoneNumber;

    public Contact() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
