package okhttp3.repackaged;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.tls.CertificateChainCleaner;
import okhttp3.repackaged.internal.tls.TrustRootIndex;
import p040o.PinLoginActivity_ViewBinding;
import p040o.SetupQuickBalanceActivity;

public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    /* access modifiers changed from: private */
    public final List<C10199a> ahe;
    /* access modifiers changed from: private */
    public final TrustRootIndex ahf;

    private CertificatePinner(Builder builder) {
        this.ahe = Util.immutableList(builder.ahe);
        this.ahf = builder.ahf;
    }

    public final void check(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<C10199a> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            TrustRootIndex trustRootIndex = this.ahf;
            if (trustRootIndex != null) {
                list = new CertificateChainCleaner(trustRootIndex).clean(list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = findMatchingPins.size();
                PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = null;
                PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C10199a aVar = findMatchingPins.get(i2);
                    if (aVar.hashAlgorithm.equals("sha256/")) {
                        if (pinLoginActivity_ViewBinding == null) {
                            pinLoginActivity_ViewBinding = m5799b(x509Certificate);
                        }
                        if (aVar.ahg.equals(pinLoginActivity_ViewBinding)) {
                            return;
                        }
                    } else if (aVar.hashAlgorithm.equals("sha1/")) {
                        if (pinLoginActivity_ViewBinding2 == null) {
                            pinLoginActivity_ViewBinding2 = m5798a(x509Certificate);
                        }
                        if (aVar.ahg.equals(pinLoginActivity_ViewBinding2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(pin(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = findMatchingPins.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append(findMatchingPins.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        check(str, (List<Certificate>) Arrays.asList(certificateArr));
    }

    /* access modifiers changed from: package-private */
    public final List<C10199a> findMatchingPins(String str) {
        List<C10199a> emptyList = Collections.emptyList();
        for (C10199a next : this.ahe) {
            if (next.matches(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: um */
    public final Builder mo58261um() {
        return new Builder(this);
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder();
            sb.append("sha256/");
            sb.append(SetupQuickBalanceActivity.MediaBrowserCompat$ItemReceiver(m5799b((X509Certificate) certificate).write));
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    static PinLoginActivity_ViewBinding m5798a(X509Certificate x509Certificate) {
        return Util.sha1(PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(x509Certificate.getPublicKey().getEncoded()));
    }

    /* renamed from: b */
    static PinLoginActivity_ViewBinding m5799b(X509Certificate x509Certificate) {
        return Util.sha256(PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(x509Certificate.getPublicKey().getEncoded()));
    }

    /* renamed from: okhttp3.repackaged.CertificatePinner$a */
    static final class C10199a {
        final PinLoginActivity_ViewBinding ahg;
        final String hashAlgorithm;
        final String pattern;

        C10199a(String str, String str2) {
            this.pattern = str;
            if (str2.startsWith("sha1/")) {
                this.hashAlgorithm = "sha1/";
                this.ahg = PinLoginActivity_ViewBinding.write(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.hashAlgorithm = "sha256/";
                this.ahg = PinLoginActivity_ViewBinding.write(str2.substring(7));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("pins must start with 'sha256/' or 'sha1/': ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
            if (this.ahg == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("pins must be base64: ");
                sb2.append(str2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean matches(String str) {
            if (this.pattern.equals(str)) {
                return true;
            }
            int indexOf = str.indexOf(46);
            if (this.pattern.startsWith(okhttp3.CertificatePinner.WILDCARD)) {
                String str2 = this.pattern;
                if (!str.regionMatches(false, indexOf + 1, str2, 2, str2.length() - 2)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C10199a) {
                C10199a aVar = (C10199a) obj;
                return this.pattern.equals(aVar.pattern) && this.hashAlgorithm.equals(aVar.hashAlgorithm) && this.ahg.equals(aVar.ahg);
            }
        }

        public final int hashCode() {
            return ((((this.pattern.hashCode() + 527) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.ahg.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.hashAlgorithm);
            sb.append(SetupQuickBalanceActivity.MediaBrowserCompat$ItemReceiver(this.ahg.write));
            return sb.toString();
        }
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public final List<C10199a> ahe;
        /* access modifiers changed from: private */
        public TrustRootIndex ahf;

        public Builder() {
            this.ahe = new ArrayList();
        }

        Builder(CertificatePinner certificatePinner) {
            ArrayList arrayList = new ArrayList();
            this.ahe = arrayList;
            arrayList.addAll(certificatePinner.ahe);
            this.ahf = certificatePinner.ahf;
        }

        public final Builder trustRootIndex(TrustRootIndex trustRootIndex) {
            this.ahf = trustRootIndex;
            return this;
        }

        public final Builder add(String str, String... strArr) {
            if (str != null) {
                for (String aVar : strArr) {
                    this.ahe.add(new C10199a(str, aVar));
                }
                return this;
            }
            throw new IllegalArgumentException("pattern == null");
        }

        public final CertificatePinner build() {
            return new CertificatePinner(this);
        }
    }
}
