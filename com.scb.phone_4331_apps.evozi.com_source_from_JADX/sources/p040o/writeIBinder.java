package p040o;

import com.scb.phone.view.fragment.hml.C5985x82597580;
import p040o.getRtpEBillPaymentReview;
import retrofit2.Response;

/* renamed from: o.writeIBinder */
public final /* synthetic */ class writeIBinder implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5985x82597580 write;

    public /* synthetic */ writeIBinder(C5985x82597580 hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.fromCallable(new getRtpEBillPaymentReview.write(this.write, (Response) obj));
    }
}
