package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.PinChangeActivity_ViewBinding;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements HowToAddAccountStep2Activity {
    final /* synthetic */ NsipPartnerPaymentReviewActivity $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ NsipPartnerPaymentOtpActivity $source;
    private boolean cacheRequestClosed;

    CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, CacheRequest cacheRequest, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) {
        this.$source = nsipPartnerPaymentOtpActivity;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = nsipPartnerPaymentReviewActivity;
    }

    public final boolean getCacheRequestClosed() {
        return this.cacheRequestClosed;
    }

    public final void setCacheRequestClosed(boolean z) {
        this.cacheRequestClosed = z;
    }

    public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        try {
            long read = this.$source.read(sCBUniversalWebViewActivity, j);
            if (read == -1) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1;
            }
            sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(this.$cacheBody.MediaMetadataCompat(), sCBUniversalWebViewActivity.read - read, read);
            this.$cacheBody.read();
            return read;
        } catch (IOException e) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            throw e;
        }
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.$source.timeout();
    }

    public final void close() throws IOException {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }
}
