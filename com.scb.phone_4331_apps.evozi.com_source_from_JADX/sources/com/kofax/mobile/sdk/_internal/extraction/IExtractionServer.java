package com.kofax.mobile.sdk._internal.extraction;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;

public interface IExtractionServer {
    void extract(DataUnit dataUnit, IDataUnitProcessedListener iDataUnitProcessedListener);

    void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener);

    void setParameters(ExtractionParameters extractionParameters);
}
