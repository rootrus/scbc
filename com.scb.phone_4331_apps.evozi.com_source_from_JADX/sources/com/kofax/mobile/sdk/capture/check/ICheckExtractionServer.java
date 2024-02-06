package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;

public interface ICheckExtractionServer extends IExtractionServer {
    void setCheckParameters(CheckParameters checkParameters);
}
