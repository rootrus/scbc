package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.j */
public class C8010j implements IKtaSessionIdProviderFactory {
    public C7996b create(ExtractionParameters extractionParameters, CertificateValidatorListener certificateValidatorListener) {
        return new C8009i(new C8020m(extractionParameters), new C8019l(extractionParameters, certificateValidatorListener));
    }
}
