package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import okhttp3.internal.Util;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNTBOnboardingFatcaQuestionsActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    public static final ConnectionSpec CLEARTEXT = new Builder(false).build();
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final ConnectionSpec MODERN_TLS;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256};
    public static final ConnectionSpec RESTRICTED_TLS;
    /* access modifiers changed from: private */
    public final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    /* access modifiers changed from: private */
    public final String[] tlsVersionsAsString;

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    public final boolean isTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final List<CipherSuite> cipherSuites() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        Collection arrayList = new ArrayList(strArr.length);
        for (String forJavaName : strArr) {
            arrayList.add(CipherSuite.Companion.forJavaName(forJavaName));
        }
        return HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList);
    }

    /* renamed from: -deprecated_cipherSuites  reason: not valid java name */
    public final List<CipherSuite> m6294deprecated_cipherSuites() {
        return cipherSuites();
    }

    public final List<TlsVersion> tlsVersions() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        Collection arrayList = new ArrayList(strArr.length);
        for (String forJavaName : strArr) {
            arrayList.add(TlsVersion.Companion.forJavaName(forJavaName));
        }
        return HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList);
    }

    /* renamed from: -deprecated_tlsVersions  reason: not valid java name */
    public final List<TlsVersion> m6296deprecated_tlsVersions() {
        return tlsVersions();
    }

    /* renamed from: -deprecated_supportsTlsExtensions  reason: not valid java name */
    public final boolean m6295deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final void apply$okhttp(SSLSocket sSLSocket, boolean z) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        ConnectionSpec supportedSpec = supportedSpec(sSLSocket, z);
        if (supportedSpec.tlsVersions() != null) {
            sSLSocket.setEnabledProtocols(supportedSpec.tlsVersionsAsString);
        }
        if (supportedSpec.cipherSuites() != null) {
            sSLSocket.setEnabledCipherSuites(supportedSpec.cipherSuitesAsString);
        }
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            onGetStartedClick.IconCompatParcelizer((Object) enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = Util.intersect(enabledCipherSuites, this.cipherSuitesAsString, CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            onGetStartedClick.IconCompatParcelizer((Object) enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr3 = this.tlsVersionsAsString;
            HmlNTBOnboardingFatcaQuestionsActivity hmlNTBOnboardingFatcaQuestionsActivity = HmlNTBOnboardingFatcaQuestionsActivity.IconCompatParcelizer;
            if (hmlNTBOnboardingFatcaQuestionsActivity != null) {
                strArr2 = Util.intersect(enabledProtocols, strArr3, hmlNTBOnboardingFatcaQuestionsActivity);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            }
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        onGetStartedClick.IconCompatParcelizer((Object) supportedCipherSuites, "supportedCipherSuites");
        int indexOf = Util.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if (z && indexOf != -1) {
            onGetStartedClick.IconCompatParcelizer((Object) strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[indexOf];
            onGetStartedClick.IconCompatParcelizer((Object) str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = Util.concat(strArr, str);
        }
        Builder builder = new Builder(this);
        onGetStartedClick.IconCompatParcelizer((Object) strArr, "cipherSuitesIntersection");
        Builder cipherSuites = builder.cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
        onGetStartedClick.IconCompatParcelizer((Object) strArr2, "tlsVersionsIntersection");
        return cipherSuites.tlsVersions((String[]) Arrays.copyOf(strArr2, strArr2.length)).build();
    }

    public final boolean isCompatible(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            HmlNTBOnboardingFatcaQuestionsActivity hmlNTBOnboardingFatcaQuestionsActivity = HmlNTBOnboardingFatcaQuestionsActivity.IconCompatParcelizer;
            if (hmlNTBOnboardingFatcaQuestionsActivity == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            } else if (!Util.hasIntersection(strArr, enabledProtocols, hmlNTBOnboardingFatcaQuestionsActivity)) {
                return false;
            }
        }
        String[] strArr2 = this.cipherSuitesAsString;
        if (strArr2 == null || Util.hasIntersection(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.isTls;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z != connectionSpec.isTls) {
            return false;
        }
        if (!z || (Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int i = 0;
        int hashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.tlsVersionsAsString;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((((hashCode + 527) * 31) + i) * 31) + (this.supportsTlsExtensions ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(");
        sb.append("cipherSuites=");
        sb.append(Objects.toString(cipherSuites(), "[all enabled]"));
        sb.append(", ");
        sb.append("tlsVersions=");
        sb.append(Objects.toString(tlsVersions(), "[all enabled]"));
        sb.append(", ");
        sb.append("supportsTlsExtensions=");
        sb.append(this.supportsTlsExtensions);
        sb.append(')');
        return sb.toString();
    }

    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        public final void setTls$okhttp(boolean z) {
            this.tls = z;
        }

        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final void setCipherSuites$okhttp(String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setTlsVersions$okhttp(String[] strArr) {
            this.tlsVersions = strArr;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
            this.supportsTlsExtensions = z;
        }

        public Builder(boolean z) {
            this.tls = z;
        }

        public Builder(ConnectionSpec connectionSpec) {
            onGetStartedClick.write((Object) connectionSpec, "connectionSpec");
            this.tls = connectionSpec.isTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        public final Builder allEnabledCipherSuites() {
            Builder builder = this;
            if (builder.tls) {
                builder.cipherSuites = null;
                return builder;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final Builder cipherSuites(CipherSuite... cipherSuiteArr) {
            onGetStartedClick.write((Object) cipherSuiteArr, "cipherSuites");
            Builder builder = this;
            if (builder.tls) {
                Collection arrayList = new ArrayList(cipherSuiteArr.length);
                for (CipherSuite javaName : cipherSuiteArr) {
                    arrayList.add(javaName.javaName());
                }
                Object[] array = ((List) arrayList).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return builder.cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final Builder cipherSuites(String... strArr) {
            onGetStartedClick.write((Object) strArr, "cipherSuites");
            Builder builder = this;
            if (builder.tls) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        builder.cipherSuites = (String[]) clone;
                        return builder;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final Builder allEnabledTlsVersions() {
            Builder builder = this;
            if (builder.tls) {
                builder.tlsVersions = null;
                return builder;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final Builder tlsVersions(TlsVersion... tlsVersionArr) {
            onGetStartedClick.write((Object) tlsVersionArr, "tlsVersions");
            Builder builder = this;
            if (builder.tls) {
                Collection arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion javaName : tlsVersionArr) {
                    arrayList.add(javaName.javaName());
                }
                Object[] array = ((List) arrayList).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return builder.tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final Builder tlsVersions(String... strArr) {
            onGetStartedClick.write((Object) strArr, "tlsVersions");
            Builder builder = this;
            if (builder.tls) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        builder.tlsVersions = (String[]) clone;
                        return builder;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final Builder supportsTlsExtensions(boolean z) {
            Builder builder = this;
            if (builder.tls) {
                builder.supportsTlsExtensions = z;
                return builder;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }

    static {
        Builder builder = new Builder(true);
        CipherSuite[] cipherSuiteArr = RESTRICTED_CIPHER_SUITES;
        RESTRICTED_TLS = builder.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length)).tlsVersions(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2).supportsTlsExtensions(true).build();
        Builder builder2 = new Builder(true);
        CipherSuite[] cipherSuiteArr2 = APPROVED_CIPHER_SUITES;
        MODERN_TLS = builder2.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2).supportsTlsExtensions(true).build();
        Builder builder3 = new Builder(true);
        CipherSuite[] cipherSuiteArr3 = APPROVED_CIPHER_SUITES;
        COMPATIBLE_TLS = builder3.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length)).tlsVersions(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
    }
}
