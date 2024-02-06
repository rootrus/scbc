package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

final class Handshake$Companion$get$1 extends CheckEligibilityActivity implements FundActionsSuccessActivity<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Handshake$Companion$get$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
