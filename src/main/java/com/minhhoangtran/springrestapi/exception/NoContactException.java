package com.minhhoangtran.springrestapi.exception;

public class NoContactException extends RuntimeException {
    public NoContactException(String id) {
        super("The contact with id:" + id + " does not exist");
    }

}
