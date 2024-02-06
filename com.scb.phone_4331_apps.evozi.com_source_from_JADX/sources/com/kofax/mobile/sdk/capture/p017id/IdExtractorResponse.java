package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.C8328Id;
import java.io.Serializable;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdExtractorResponse */
public class IdExtractorResponse extends ExtractorResponse<C8328Id> implements Serializable {
    public IdExtractorResponse(C8328Id id, ExceptionResponse exceptionResponse) {
        this.results = id;
        this.exceptionResponse = exceptionResponse;
    }
}
