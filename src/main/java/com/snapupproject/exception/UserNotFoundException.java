package com.snapupproject.exception;

public class UserNotFoundException extends DataObjectNotFoundException {
    public UserNotFoundException() {
        super("UserNotFound");
    }
}
