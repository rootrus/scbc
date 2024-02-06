package com.kofax.mobile.sdk.capture.extraction;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionResponseImpl implements ExceptionResponse {
    String acd = "";
    String ace = "";
    String acf = "";
    ExceptionResponse acg = null;

    /* renamed from: tC */
    String f4720tC = "";

    public ExceptionResponseImpl(Throwable th) {
        this.acd = th.getMessage();
        this.ace = th.getClass().getSimpleName();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        this.acf = stringWriter.toString();
    }

    public String exceptionMessage() {
        return this.acd;
    }

    public String exceptionType() {
        return this.ace;
    }

    public String message() {
        return this.f4720tC;
    }

    public String stackTrace() {
        return this.acf;
    }

    public ExceptionResponse innerException() {
        return this.acg;
    }
}
