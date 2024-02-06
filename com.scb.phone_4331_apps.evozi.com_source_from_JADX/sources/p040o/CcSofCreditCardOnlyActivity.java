package p040o;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: o.CcSofCreditCardOnlyActivity */
public final class CcSofCreditCardOnlyActivity extends RequestBody {
    private final RequestBody MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public final C6372x3d677cbb write;

    public final long contentLength() throws IOException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.contentLength();
    }

    public final MediaType contentType() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.contentType();
    }

    public final void writeTo(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) throws IOException {
        NsipPartnerPaymentReviewActivity read = onSubmit.read((PinChangeActivity) new PartnerLoginActivity(nsipPartnerPaymentReviewActivity) {
            private long IconCompatParcelizer = 0;
            private long MediaBrowserCompat$CustomActionResultReceiver = 0;

            public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
                super.write(sCBUniversalWebViewActivity, j);
                if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = CcSofCreditCardOnlyActivity.this.contentLength();
                }
                this.IconCompatParcelizer += j;
                C6372x3d677cbb unused = CcSofCreditCardOnlyActivity.this.write;
            }
        });
        this.MediaBrowserCompat$CustomActionResultReceiver.writeTo(read);
        read.flush();
    }
}
