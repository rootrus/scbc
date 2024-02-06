package com.kofax.mobile.sdk.capture.extraction;

import java.io.Serializable;

public interface ExceptionResponse extends Serializable {
    String exceptionMessage();

    String exceptionType();

    ExceptionResponse innerException();

    String message();

    String stackTrace();
}
