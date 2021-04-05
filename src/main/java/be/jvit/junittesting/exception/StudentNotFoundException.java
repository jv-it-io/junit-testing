package be.jvit.junittesting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Jonathan Vandersmissen
 * @created 4/5/2021
 * @project junit-testing
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String msg) {
        super(msg);
    }
}