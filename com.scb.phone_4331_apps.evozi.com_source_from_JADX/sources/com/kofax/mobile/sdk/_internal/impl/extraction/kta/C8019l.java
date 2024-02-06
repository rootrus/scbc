package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.extraction.C7899a;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.C8018g;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.l */
public class C8019l implements C7996b {

    /* renamed from: JI */
    private final CertificateValidatorListener f3853JI;
    private final ExtractionParameters _parameters;

    public C8019l(ExtractionParameters extractionParameters, CertificateValidatorListener certificateValidatorListener) {
        if (extractionParameters != null) {
            this._parameters = extractionParameters;
            this.f3853JI = certificateValidatorListener;
            return;
        }
        throw new IllegalArgumentException("parameters may not be null");
    }

    /* renamed from: mz */
    public String mo54387mz() throws C7899a {
        try {
            return new C8018g(this._parameters.serverUrl, this.f3853JI).mo54417x(this._parameters.credentials.username, this._parameters.credentials.password).mo54416mO();
        } catch (JSONException e) {
            throw m4009e(e);
        } catch (IOException e2) {
            throw m4009e(e2);
        }
    }

    /* renamed from: e */
    private static C7899a m4009e(Exception exc) {
        return new C7899a(C8007g.m3987d(exc));
    }
}
