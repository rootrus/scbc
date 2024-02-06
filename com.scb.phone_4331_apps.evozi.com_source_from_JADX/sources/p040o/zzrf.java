package p040o;

import com.scb.phone.domain.p036di.prepaid.nsip.NsipPaymentCaseModule;
import p040o.Functions;
import p040o.ServerProjectProvider;

/* renamed from: o.zzrf */
public final class zzrf implements OPRStatusRewardsLandingActivity_ViewBinding<Functions.FunctionForMapNoDefault> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<ServerProjectProvider.C70684> read;
    private final NsipPaymentCaseModule write;

    private zzrf(NsipPaymentCaseModule nsipPaymentCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C70684> hmlReviewDocumentActivity3) {
        this.write = nsipPaymentCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzrf MediaBrowserCompat$CustomActionResultReceiver(NsipPaymentCaseModule nsipPaymentCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C70684> hmlReviewDocumentActivity3) {
        return new zzrf(nsipPaymentCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Functions.FunctionForMapNoDefault MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
