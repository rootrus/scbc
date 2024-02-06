package com.kofax.mobile.sdk.extract.server;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import java.util.concurrent.TimeUnit;

public class LoginCredentials {

    /* renamed from: JI */
    private final CertificateValidatorListener f4896JI;
    private final String afQ;
    private final String afR;
    private final String afS;
    private final TimeOutParameters afT;

    public LoginCredentials(String str, String str2, String str3, CertificateValidatorListener certificateValidatorListener, TimeOutParameters timeOutParameters) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                if (!((str3 == null || str3.length() == 0) ? true : z)) {
                    if (!str3.endsWith("/")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append("/");
                        str3 = sb.toString();
                    }
                    this.afQ = str;
                    this.afR = str2;
                    this.afS = str3;
                    this.f4896JI = certificateValidatorListener;
                    this.afT = timeOutParameters == null ? new TimeOutParameters(60, TimeUnit.SECONDS) : timeOutParameters;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Profile parameters cannot be null");
    }

    public String getKtaUserName() {
        return this.afQ;
    }

    public String getKtaPassword() {
        return this.afR;
    }

    public String getServerUrl() {
        return this.afS;
    }

    public CertificateValidatorListener getCertificateValidatorListener() {
        return this.f4896JI;
    }

    public TimeOutParameters getTimeOutParameters() {
        return this.afT;
    }
}
