package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public abstract class CertificateChainCleaner {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);

    public abstract List<Certificate> clean(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final CertificateChainCleaner get(X509TrustManager x509TrustManager) {
            onGetStartedClick.write((Object) x509TrustManager, "trustManager");
            return Platform.Companion.get().buildCertificateChainCleaner(x509TrustManager);
        }

        public final CertificateChainCleaner get(X509Certificate... x509CertificateArr) {
            onGetStartedClick.write((Object) x509CertificateArr, "caCerts");
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }
    }
}
