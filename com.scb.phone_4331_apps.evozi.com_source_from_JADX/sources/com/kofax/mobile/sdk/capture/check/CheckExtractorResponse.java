package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.Check;
import java.io.Serializable;

public class CheckExtractorResponse extends ExtractorResponse<Check> implements Serializable {
    public CheckExtractorResponse(Check check, ExceptionResponse exceptionResponse) {
        this.results = check;
        this.exceptionResponse = exceptionResponse;
    }
}
