package okhttp3.repackaged;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.repackaged.internal.Util;

public final class Handshake {
    private final TlsVersion ahG;
    private final CipherSuite ahH;
    private final List<Certificate> ahI;
    private final List<Certificate> ahJ;

    private Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<Certificate> list, List<Certificate> list2) {
        this.ahG = tlsVersion;
        this.ahH = cipherSuite;
        this.ahI = list;
        this.ahJ = list2;
    }

    public static Handshake get(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            CipherSuite forJavaName = CipherSuite.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                TlsVersion forJavaName2 = TlsVersion.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = Util.immutableList((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = Util.immutableList((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new Handshake(forJavaName2, forJavaName, list, list2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public static Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<Certificate> list, List<Certificate> list2) {
        if (cipherSuite != null) {
            return new Handshake(tlsVersion, cipherSuite, Util.immutableList(list), Util.immutableList(list2));
        }
        throw new IllegalArgumentException("cipherSuite == null");
    }

    public final TlsVersion tlsVersion() {
        return this.ahG;
    }

    public final CipherSuite cipherSuite() {
        return this.ahH;
    }

    public final List<Certificate> peerCertificates() {
        return this.ahI;
    }

    public final Principal peerPrincipal() {
        if (!this.ahI.isEmpty()) {
            return ((X509Certificate) this.ahI.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> localCertificates() {
        return this.ahJ;
    }

    public final Principal localPrincipal() {
        if (!this.ahJ.isEmpty()) {
            return ((X509Certificate) this.ahJ.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        if (!Util.equal(this.ahH, handshake.ahH) || !this.ahH.equals(handshake.ahH) || !this.ahI.equals(handshake.ahI) || !this.ahJ.equals(handshake.ahJ)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        TlsVersion tlsVersion = this.ahG;
        return (((((((tlsVersion != null ? tlsVersion.hashCode() : 0) + 527) * 31) + this.ahH.hashCode()) * 31) + this.ahI.hashCode()) * 31) + this.ahJ.hashCode();
    }
}
