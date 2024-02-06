package okhttp3.internal.connection;

import okhttp3.internal.p089ws.RealWebSocket;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;

public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    final /* synthetic */ Exchange $exchange;
    final /* synthetic */ NsipPartnerPaymentReviewActivity $sink;
    final /* synthetic */ NsipPartnerPaymentOtpActivity $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$newWebSocketStreams$1(Exchange exchange, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, boolean z, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity2, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity2) {
        super(z, nsipPartnerPaymentOtpActivity2, nsipPartnerPaymentReviewActivity2);
        this.$exchange = exchange;
        this.$source = nsipPartnerPaymentOtpActivity;
        this.$sink = nsipPartnerPaymentReviewActivity;
    }

    public final void close() {
        this.$exchange.bodyComplete(-1, true, true, null);
    }
}
