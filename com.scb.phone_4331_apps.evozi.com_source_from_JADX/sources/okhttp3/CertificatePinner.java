package okhttp3;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.TypeCastException;
import okhttp3.HttpUrl;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p040o.C7043xa484e06c;
import p040o.FundActionsSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNationalIdActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onAddAccountClick;
import p040o.onGetStartedClick;

public final class CertificatePinner {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    public static final String WILDCARD = "*.";
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        onGetStartedClick.write((Object) set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        onGetStartedClick.write((Object) str, "hostname");
        onGetStartedClick.write((Object) list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, FundActionsSuccessActivity<? extends List<? extends X509Certificate>> fundActionsSuccessActivity) {
        Pin next;
        onGetStartedClick.write((Object) str, "hostname");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins$okhttp = findMatchingPins$okhttp(str);
        if (!findMatchingPins$okhttp.isEmpty()) {
            List<X509Certificate> list = (List) fundActionsSuccessActivity.invoke();
            loop0:
            for (X509Certificate x509Certificate : list) {
                Iterator<Pin> it = findMatchingPins$okhttp.iterator();
                SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = null;
                SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2 = null;
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        String hashAlgorithm = next.getHashAlgorithm();
                        int hashCode = hashAlgorithm.hashCode();
                        if (hashCode == 109397962) {
                            if (!hashAlgorithm.equals("sha1/")) {
                                break loop0;
                            }
                            if (sCBUniversalWebViewActivity_ViewBinding == null) {
                                sCBUniversalWebViewActivity_ViewBinding = Companion.toSha1ByteString$okhttp(x509Certificate);
                            }
                            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) next.getHash(), (Object) sCBUniversalWebViewActivity_ViewBinding)) {
                                return;
                            }
                        } else if (hashCode != 2052263656 || !hashAlgorithm.equals("sha256/")) {
                            break loop0;
                        } else {
                            if (sCBUniversalWebViewActivity_ViewBinding2 == null) {
                                sCBUniversalWebViewActivity_ViewBinding2 = Companion.toSha256ByteString$okhttp(x509Certificate);
                            }
                            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) next.getHash(), (Object) sCBUniversalWebViewActivity_ViewBinding2)) {
                                return;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unsupported hashAlgorithm: ");
                sb.append(next.getHashAlgorithm());
                throw new AssertionError(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                if (x509Certificate2 != null) {
                    sb2.append("\n    ");
                    sb2.append(Companion.pin(x509Certificate2));
                    sb2.append(": ");
                    Principal subjectDN = x509Certificate2.getSubjectDN();
                    onGetStartedClick.IconCompatParcelizer((Object) subjectDN, "x509Certificate.subjectDN");
                    sb2.append(subjectDN.getName());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            for (Pin append : findMatchingPins$okhttp) {
                sb2.append("\n    ");
                sb2.append(append);
            }
            String obj = sb2.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(obj);
        }
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        onGetStartedClick.write((Object) str, "hostname");
        onGetStartedClick.write((Object) certificateArr, "peerCertificates");
        check(str, (List<? extends Certificate>) HmlBusinessOwnerReviewSubmissionActivity.write((T[]) certificateArr));
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.certificateChainCleaner, (Object) certificateChainCleaner2)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) certificatePinner.pins, (Object) this.pins) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) certificatePinner.certificateChainCleaner, (Object) this.certificateChainCleaner);
        }
    }

    public final int hashCode() {
        int hashCode = this.pins.hashCode();
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        return ((hashCode + 1517) * 41) + (certificateChainCleaner2 != null ? certificateChainCleaner2.hashCode() : 0);
    }

    public static final class Pin {
        private final String canonicalHostname;
        private final SCBUniversalWebViewActivity_ViewBinding hash;
        private final String hashAlgorithm;
        private final String pattern;

        private final String component2() {
            return this.canonicalHostname;
        }

        public static /* synthetic */ Pin copy$default(Pin pin, String str, String str2, String str3, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pin.pattern;
            }
            if ((i & 2) != 0) {
                str2 = pin.canonicalHostname;
            }
            if ((i & 4) != 0) {
                str3 = pin.hashAlgorithm;
            }
            if ((i & 8) != 0) {
                sCBUniversalWebViewActivity_ViewBinding = pin.hash;
            }
            return pin.copy(str, str2, str3, sCBUniversalWebViewActivity_ViewBinding);
        }

        public final String component1() {
            return this.pattern;
        }

        public final String component3() {
            return this.hashAlgorithm;
        }

        public final SCBUniversalWebViewActivity_ViewBinding component4() {
            return this.hash;
        }

        public final Pin copy(String str, String str2, String str3, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
            onGetStartedClick.write((Object) str, "pattern");
            onGetStartedClick.write((Object) str2, "canonicalHostname");
            onGetStartedClick.write((Object) str3, "hashAlgorithm");
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "hash");
            return new Pin(str, str2, str3, sCBUniversalWebViewActivity_ViewBinding);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.pattern, (Object) pin.pattern) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.canonicalHostname, (Object) pin.canonicalHostname) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.hashAlgorithm, (Object) pin.hashAlgorithm) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.hash, (Object) pin.hash);
        }

        public final int hashCode() {
            String str = this.pattern;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.canonicalHostname;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.hashAlgorithm;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = this.hash;
            if (sCBUniversalWebViewActivity_ViewBinding != null) {
                i = sCBUniversalWebViewActivity_ViewBinding.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public Pin(String str, String str2, String str3, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
            onGetStartedClick.write((Object) str, "pattern");
            onGetStartedClick.write((Object) str2, "canonicalHostname");
            onGetStartedClick.write((Object) str3, "hashAlgorithm");
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "hash");
            this.pattern = str;
            this.canonicalHostname = str2;
            this.hashAlgorithm = str3;
            this.hash = sCBUniversalWebViewActivity_ViewBinding;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final SCBUniversalWebViewActivity_ViewBinding getHash() {
            return this.hash;
        }

        public final boolean matches(String str) {
            onGetStartedClick.write((Object) str, "hostname");
            if (!GoodToKnowActivity.read(this.pattern, CertificatePinner.WILDCARD, false)) {
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) this.canonicalHostname);
            }
            int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) str, '.', 0, false);
            if ((str.length() - MediaBrowserCompat$CustomActionResultReceiver) - 1 != this.canonicalHostname.length() || !GoodToKnowActivity.write(str, this.canonicalHostname, MediaBrowserCompat$CustomActionResultReceiver + 1, false)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.hashAlgorithm);
            sb.append(this.hash.MediaBrowserCompat$ItemReceiver());
            return sb.toString();
        }
    }

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            onGetStartedClick.write((Object) str, "pattern");
            onGetStartedClick.write((Object) strArr, "pins");
            Builder builder = this;
            for (String newPin$okhttp : strArr) {
                builder.pins.add(CertificatePinner.Companion.newPin$okhttp(str, newPin$okhttp));
            }
            return builder;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(HmlNTBBusinessURLInformationActivity.write(this.pins), (CertificateChainCleaner) null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final String pin(Certificate certificate) {
            onGetStartedClick.write((Object) certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                StringBuilder sb = new StringBuilder();
                sb.append("sha256/");
                sb.append(toSha256ByteString$okhttp((X509Certificate) certificate).MediaBrowserCompat$ItemReceiver());
                return sb.toString();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final SCBUniversalWebViewActivity_ViewBinding toSha1ByteString$okhttp(X509Certificate x509Certificate) {
            onGetStartedClick.write((Object) x509Certificate, "$this$toSha1ByteString");
            C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
            PublicKey publicKey = x509Certificate.getPublicKey();
            onGetStartedClick.IconCompatParcelizer((Object) publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            onGetStartedClick.IconCompatParcelizer((Object) encoded, "publicKey.encoded");
            return C7043xa484e06c.MediaBrowserCompat$CustomActionResultReceiver(encoded, 0, encoded.length).IconCompatParcelizer(McElieceCCA2KeyGenParameterSpec.SHA1);
        }

        public final SCBUniversalWebViewActivity_ViewBinding toSha256ByteString$okhttp(X509Certificate x509Certificate) {
            onGetStartedClick.write((Object) x509Certificate, "$this$toSha256ByteString");
            C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
            PublicKey publicKey = x509Certificate.getPublicKey();
            onGetStartedClick.IconCompatParcelizer((Object) publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            onGetStartedClick.IconCompatParcelizer((Object) encoded, "publicKey.encoded");
            return C7043xa484e06c.MediaBrowserCompat$CustomActionResultReceiver(encoded, 0, encoded.length).IconCompatParcelizer(McElieceCCA2KeyGenParameterSpec.SHA256);
        }

        public final Pin newPin$okhttp(String str, String str2) {
            String str3;
            onGetStartedClick.write((Object) str, "pattern");
            onGetStartedClick.write((Object) str2, "pin");
            if (GoodToKnowActivity.read(str, CertificatePinner.WILDCARD, false)) {
                HttpUrl.Companion companion = HttpUrl.Companion;
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                String substring = str.substring(2);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str3 = companion.get(sb.toString()).host();
            } else {
                HttpUrl.Companion companion2 = HttpUrl.Companion;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http://");
                sb2.append(str);
                str3 = companion2.get(sb2.toString()).host();
            }
            if (GoodToKnowActivity.read(str2, "sha1/", false)) {
                C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
                String substring2 = str2.substring(5);
                onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                onGetStartedClick.write((Object) substring2, "$receiver");
                SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver = PinChangeSuccessActivity.MediaBrowserCompat$ItemReceiver(substring2);
                if (MediaBrowserCompat$ItemReceiver == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                return new Pin(str, str3, "sha1/", MediaBrowserCompat$ItemReceiver);
            } else if (GoodToKnowActivity.read(str2, "sha256/", false)) {
                C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = SCBUniversalWebViewActivity_ViewBinding.write;
                String substring3 = str2.substring(7);
                onGetStartedClick.IconCompatParcelizer((Object) substring3, "(this as java.lang.String).substring(startIndex)");
                onGetStartedClick.write((Object) substring3, "$receiver");
                SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver2 = PinChangeSuccessActivity.MediaBrowserCompat$ItemReceiver(substring3);
                if (MediaBrowserCompat$ItemReceiver2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                return new Pin(str, str3, "sha256/", MediaBrowserCompat$ItemReceiver2);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("pins must start with 'sha256/' or 'sha1/': ");
                sb3.append(str2);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
    }

    public final List<Pin> findMatchingPins$okhttp(String str) {
        onGetStartedClick.write((Object) str, "hostname");
        List<Pin> list = HmlNationalIdActivity.IconCompatParcelizer;
        for (Pin next : this.pins) {
            if (next.matches(str)) {
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                }
                if (list != null) {
                    onAddAccountClick.MediaBrowserCompat$CustomActionResultReceiver(list).add(next);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<okhttp3.CertificatePinner.Pin>");
                }
            }
        }
        return list;
    }
}
