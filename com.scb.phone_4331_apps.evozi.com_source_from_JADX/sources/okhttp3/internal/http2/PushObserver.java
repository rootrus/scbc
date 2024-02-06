package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NtbDiscoverFundFilterActivity;

public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver$Companion$CANCEL$1();
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);

    boolean onData(int i, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
