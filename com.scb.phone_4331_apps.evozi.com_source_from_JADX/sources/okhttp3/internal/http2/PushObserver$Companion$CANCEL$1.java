package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.onGetStartedClick;

public final class PushObserver$Companion$CANCEL$1 implements PushObserver {
    public final boolean onHeaders(int i, List<Header> list, boolean z) {
        onGetStartedClick.write((Object) list, "responseHeaders");
        return true;
    }

    public final boolean onRequest(int i, List<Header> list) {
        onGetStartedClick.write((Object) list, "requestHeaders");
        return true;
    }

    public final void onReset(int i, ErrorCode errorCode) {
        onGetStartedClick.write((Object) errorCode, "errorCode");
    }

    PushObserver$Companion$CANCEL$1() {
    }

    public final boolean onData(int i, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, int i2, boolean z) throws IOException {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        nsipPartnerPaymentOtpActivity.MediaBrowserCompat$MediaItem((long) i2);
        return true;
    }
}
