package p040o;

import com.scb.phone.domain.p036di.prepaid.nsip.NsipPaymentCaseModule;
import p040o.Functions;

/* renamed from: o.zzrg */
public final class zzrg implements OPRStatusRewardsLandingActivity_ViewBinding<Functions.FunctionComposition> {
    private final HmlReviewDocumentActivity<C7515tZ> MediaBrowserCompat$CustomActionResultReceiver;
    private final NsipPaymentCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzrg(NsipPaymentCaseModule nsipPaymentCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7515tZ> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = nsipPaymentCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzrg IconCompatParcelizer(NsipPaymentCaseModule nsipPaymentCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7515tZ> hmlReviewDocumentActivity3) {
        return new zzrg(nsipPaymentCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Functions.FunctionComposition MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.read.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
