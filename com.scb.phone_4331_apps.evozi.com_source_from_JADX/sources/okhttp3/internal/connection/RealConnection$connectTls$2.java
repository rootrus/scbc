package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import okhttp3.Handshake;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.onGetStartedClick;

final class RealConnection$connectTls$2 extends CheckEligibilityActivity implements FundActionsSuccessActivity<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    public final List<X509Certificate> invoke() {
        Handshake access$getHandshake$p = this.this$0.handshake;
        if (access$getHandshake$p == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Iterable<Certificate> peerCertificates = access$getHandshake$p.peerCertificates();
        int i = 10;
        onGetStartedClick.write((Object) peerCertificates, "$this$collectionSizeOrDefault");
        if (peerCertificates instanceof Collection) {
            i = ((Collection) peerCertificates).size();
        }
        Collection arrayList = new ArrayList(i);
        for (Certificate certificate : peerCertificates) {
            if (certificate != null) {
                arrayList.add((X509Certificate) certificate);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        return (List) arrayList;
    }
}
