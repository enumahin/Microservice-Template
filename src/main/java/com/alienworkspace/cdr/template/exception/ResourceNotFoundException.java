package com.alienworkspace.cdr.template.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception thrown when a resource is not found.
 *
 * @author Ikenumah (enumahinm@gmail.com)
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    /**
     * Construct a new instance with a message that is a string concatenation of the field name and
     * the value of the field that was not found.
     *
     * @param field the name of the field that was not found
     * @param fieldValue the value of the field that was not found
     */
    public ResourceNotFoundException(String field, String fieldValue) {
        super(String.format("%s %s not found", field, fieldValue));
    }
}
