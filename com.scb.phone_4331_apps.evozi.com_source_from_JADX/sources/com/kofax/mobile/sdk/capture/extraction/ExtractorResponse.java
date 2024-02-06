package com.kofax.mobile.sdk.capture.extraction;

import java.io.Serializable;

public class ExtractorResponse<T extends Serializable> implements Serializable {
    public ExceptionResponse exceptionResponse;
    public T results;
}
