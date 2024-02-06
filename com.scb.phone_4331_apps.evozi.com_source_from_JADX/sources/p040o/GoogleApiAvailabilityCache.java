package p040o;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: o.GoogleApiAvailabilityCache */
public final class GoogleApiAvailabilityCache implements X509TrustManager {
    private final String IconCompatParcelizer;
    private X509TrustManager write;

    public GoogleApiAvailabilityCache(X509TrustManager x509TrustManager, String str) {
        this.write = x509TrustManager;
        this.IconCompatParcelizer = str;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.write.checkClientTrusted(x509CertificateArr, str);
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.write.checkServerTrusted(x509CertificateArr, str);
        if (!x509CertificateArr[0].getSubjectDN().getName().contains(this.IconCompatParcelizer)) {
            throw new CertificateException();
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.write.getAcceptedIssuers();
    }
}
