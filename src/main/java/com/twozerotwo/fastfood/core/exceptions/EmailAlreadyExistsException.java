package com.twozerotwo.fastfood.core.exceptions;

import java.io.Serial;

public class EmailAlreadyExistsException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -2498959432238998699L;

    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}
