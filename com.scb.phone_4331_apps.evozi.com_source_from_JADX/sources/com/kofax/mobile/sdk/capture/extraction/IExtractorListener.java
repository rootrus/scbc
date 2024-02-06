package com.kofax.mobile.sdk.capture.extraction;

import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;

public interface IExtractorListener<T extends ExtractorResponse> {
    void onExtractionComplete(T t);
}
