package be.jvit.junittesting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Jonathan Vandersmissen
 * @created 4/5/2021
 * @project junit-testing
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{

    public BadRequestException(String msg) {
        super(msg);
    }
}