package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.Util;
import p040o.CheckEligibilityActivity_ViewBinding;
import p040o.FundActionsSuccessActivity;
import p040o.FundAppFormActivity_ViewBinding;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlNationalIdActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.clickNext;
import p040o.onGetStartedClick;

public final class Handshake {
    static final /* synthetic */ clickNext[] $$delegatedProperties = {FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write(Handshake.class), "peerCertificates", "peerCertificates()Ljava/util/List;"))};
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final HmlVerifyEmailActivity peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    public static final Handshake get(TlsVersion tlsVersion2, CipherSuite cipherSuite2, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion2, cipherSuite2, list, list2);
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public Handshake(TlsVersion tlsVersion2, CipherSuite cipherSuite2, List<? extends Certificate> list, FundActionsSuccessActivity<? extends List<? extends Certificate>> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) tlsVersion2, "tlsVersion");
        onGetStartedClick.write((Object) cipherSuite2, "cipherSuite");
        onGetStartedClick.write((Object) list, "localCertificates");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "peerCertificatesFn");
        this.tlsVersion = tlsVersion2;
        this.cipherSuite = cipherSuite2;
        this.localCertificates = list;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.peerCertificates$delegate = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    /* renamed from: -deprecated_tlsVersion  reason: not valid java name */
    public final TlsVersion m6367deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    /* renamed from: -deprecated_cipherSuite  reason: not valid java name */
    public final CipherSuite m6362deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* renamed from: -deprecated_peerCertificates  reason: not valid java name */
    public final List<Certificate> m6365deprecated_peerCertificates() {
        return peerCertificates();
    }

    public final Principal peerPrincipal() {
        List<Certificate> peerCertificates = peerCertificates();
        onGetStartedClick.write((Object) peerCertificates, "$this$firstOrNull");
        X500Principal x500Principal = null;
        Certificate certificate = peerCertificates.isEmpty() ? null : peerCertificates.get(0);
        if (!(certificate instanceof X509Certificate)) {
            certificate = null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (x509Certificate != null) {
            x500Principal = x509Certificate.getSubjectX500Principal();
        }
        return x500Principal;
    }

    /* renamed from: -deprecated_peerPrincipal  reason: not valid java name */
    public final Principal m6366deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* renamed from: -deprecated_localCertificates  reason: not valid java name */
    public final List<Certificate> m6363deprecated_localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        List<Certificate> list = this.localCertificates;
        onGetStartedClick.write((Object) list, "$this$firstOrNull");
        X500Principal x500Principal = null;
        Certificate certificate = list.isEmpty() ? null : list.get(0);
        if (!(certificate instanceof X509Certificate)) {
            certificate = null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (x509Certificate != null) {
            x500Principal = x509Certificate.getSubjectX500Principal();
        }
        return x500Principal;
    }

    /* renamed from: -deprecated_localPrincipal  reason: not valid java name */
    public final Principal m6364deprecated_localPrincipal() {
        return localPrincipal();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            return handshake.tlsVersion == this.tlsVersion && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) handshake.cipherSuite, (Object) this.cipherSuite) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) handshake.peerCertificates(), (Object) peerCertificates()) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) handshake.localCertificates, (Object) this.localCertificates);
        }
    }

    public final int hashCode() {
        int hashCode = this.tlsVersion.hashCode();
        return ((((((hashCode + 527) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(' ');
        sb.append("peerCertificates=");
        Iterable<Certificate> peerCertificates = peerCertificates();
        onGetStartedClick.write((Object) peerCertificates, "$this$collectionSizeOrDefault");
        int i = 10;
        Collection arrayList = new ArrayList(peerCertificates instanceof Collection ? ((Collection) peerCertificates).size() : 10);
        for (Certificate name : peerCertificates) {
            arrayList.add(getName(name));
        }
        sb.append((List) arrayList);
        sb.append(' ');
        sb.append("localCertificates=");
        Iterable<Certificate> iterable = this.localCertificates;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList2 = new ArrayList(i);
        for (Certificate name2 : iterable) {
            arrayList2.add(getName(name2));
        }
        sb.append((List) arrayList2);
        sb.append('}');
        return sb.toString();
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        onGetStartedClick.IconCompatParcelizer((Object) type, "type");
        return type;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
            List<Certificate> list;
            onGetStartedClick.write((Object) sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            } else if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "SSL_NULL_WITH_NULL_NULL", (Object) cipherSuite)) {
                CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "NONE", (Object) protocol)) {
                    TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                    try {
                        list = toImmutableList(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = HmlNationalIdActivity.IconCompatParcelizer;
                    }
                    return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            }
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : HmlNationalIdActivity.IconCompatParcelizer;
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final Handshake m6368deprecated_get(SSLSession sSLSession) throws IOException {
            onGetStartedClick.write((Object) sSLSession, "sslSession");
            return get(sSLSession);
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            onGetStartedClick.write((Object) tlsVersion, "tlsVersion");
            onGetStartedClick.write((Object) cipherSuite, "cipherSuite");
            onGetStartedClick.write((Object) list, "peerCertificates");
            onGetStartedClick.write((Object) list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }
}
