package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p040o.onGetStartedClick;

public final class BasicTrustRootIndex implements TrustRootIndex {
    private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        onGetStartedClick.write((Object) x509CertificateArr, "caCerts");
        Map<X500Principal, Set<X509Certificate>> linkedHashMap = new LinkedHashMap<>();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            onGetStartedClick.IconCompatParcelizer((Object) subjectX500Principal, "caCert.subjectX500Principal");
            Set<X509Certificate> set = linkedHashMap.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>();
                linkedHashMap.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cert"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.subjectToCaCerts
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 == 0) goto L_0x0036
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0034
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch:{ Exception -> 0x0030 }
            r5.verify(r3)     // Catch:{ Exception -> 0x0030 }
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x001a
            r1 = r2
        L_0x0034:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.BasicTrustRootIndex.findByIssuerAndSignature(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicTrustRootIndex) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((BasicTrustRootIndex) obj).subjectToCaCerts, (Object) this.subjectToCaCerts));
    }

    public final int hashCode() {
        return this.subjectToCaCerts.hashCode();
    }
}
