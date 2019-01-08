package com.snapupproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

class DataObjectNotFoundException extends HttpStatusCodeException {
    DataObjectNotFoundException(String statusText) {
        super(HttpStatus.NOT_FOUND, statusText);
    }
}
