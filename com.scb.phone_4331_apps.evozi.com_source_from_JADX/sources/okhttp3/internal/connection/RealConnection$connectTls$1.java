package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.onGetStartedClick;

final class RealConnection$connectTls$1 extends CheckEligibilityActivity implements FundActionsSuccessActivity<List<? extends Certificate>> {
    final /* synthetic */ Address $address;
    final /* synthetic */ CertificatePinner $certificatePinner;
    final /* synthetic */ Handshake $unverifiedHandshake;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.$certificatePinner = certificatePinner;
        this.$unverifiedHandshake = handshake;
        this.$address = address;
    }

    public final List<Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner$okhttp();
        if (certificateChainCleaner$okhttp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
    }
}
