package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.TypeCastException;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final int MAX_SIGNERS = 9;
    private final TrustRootIndex trustRootIndex;

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex2) {
        onGetStartedClick.write((Object) trustRootIndex2, "trustRootIndex");
        this.trustRootIndex = trustRootIndex2;
    }

    public final List<Certificate> clean(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        onGetStartedClick.write((Object) list, "chain");
        onGetStartedClick.write((Object) str, "hostname");
        Deque arrayDeque = new ArrayDeque(list);
        List<Certificate> arrayList = new ArrayList<>();
        Object removeFirst = arrayDeque.removeFirst();
        onGetStartedClick.IconCompatParcelizer(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            Certificate certificate = arrayList.get(arrayList.size() - 1);
            if (certificate != null) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                X509Certificate findByIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate);
                if (findByIssuerAndSignature != null) {
                    if (arrayList.size() > 1 || (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) x509Certificate, (Object) findByIssuerAndSignature))) {
                        arrayList.add(findByIssuerAndSignature);
                    }
                    if (verifySignature(findByIssuerAndSignature, findByIssuerAndSignature)) {
                        return arrayList;
                    }
                    z = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    onGetStartedClick.IconCompatParcelizer((Object) it, "queue.iterator()");
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            X509Certificate x509Certificate2 = (X509Certificate) next;
                            if (verifySignature(x509Certificate, x509Certificate2)) {
                                it.remove();
                                arrayList.add(x509Certificate2);
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                    }
                    if (z) {
                        return arrayList;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to find a trusted cert that signed ");
                    sb.append(x509Certificate);
                    throw new SSLPeerUnverifiedException(sb.toString());
                }
                i++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate chain too long: ");
        sb2.append(arrayList);
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    private final boolean verifySignature(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) x509Certificate.getIssuerDN(), (Object) x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.trustRootIndex.hashCode();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicCertificateChainCleaner) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((BasicCertificateChainCleaner) obj).trustRootIndex, (Object) this.trustRootIndex));
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
