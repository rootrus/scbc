package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.Passport;
import java.io.Serializable;

public class PassportExtractorResponse extends ExtractorResponse<Passport> implements Serializable {
    public PassportExtractorResponse(Passport passport, ExceptionResponse exceptionResponse) {
        this.results = passport;
        this.exceptionResponse = exceptionResponse;
    }
}
