package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.Bill;
import java.io.Serializable;

public class BillExtractorResponse extends ExtractorResponse<Bill> implements Serializable {
    public BillExtractorResponse(Bill bill, ExceptionResponse exceptionResponse) {
        this.results = bill;
        this.exceptionResponse = exceptionResponse;
    }
}
