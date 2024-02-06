package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;

public interface IKtaSessionIdProviderFactory {
    C7996b create(ExtractionParameters extractionParameters, CertificateValidatorListener certificateValidatorListener);
}
