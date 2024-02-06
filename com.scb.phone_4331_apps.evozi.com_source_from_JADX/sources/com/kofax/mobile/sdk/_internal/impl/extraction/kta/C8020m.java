package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.m */
public class C8020m implements C7996b {
    private final ExtractionParameters _parameters;

    public C8020m(ExtractionParameters extractionParameters) {
        if (extractionParameters != null) {
            this._parameters = extractionParameters;
            return;
        }
        throw new IllegalArgumentException("parameters may not be null");
    }

    /* renamed from: mz */
    public String mo54387mz() {
        return this._parameters.credentials.sessionId;
    }
}
