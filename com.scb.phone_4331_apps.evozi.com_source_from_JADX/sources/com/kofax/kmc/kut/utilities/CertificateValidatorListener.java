package com.kofax.kmc.kut.utilities;

import java.io.Serializable;
import javax.net.ssl.SSLSocketFactory;

public interface CertificateValidatorListener extends Serializable {
    SSLSocketFactory getSSLSocketFactory(String str);
}
