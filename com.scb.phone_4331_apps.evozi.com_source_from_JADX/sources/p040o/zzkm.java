package p040o;

import com.scb.phone.data.network.service.prepaid.cashout.PrepaidCashOutService;

/* renamed from: o.zzkm */
public final class zzkm implements OPRStatusRewardsLandingActivity_ViewBinding<zzki> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<PrepaidCashOutService> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<OptionalPendingResult> read;

    private zzkm(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrepaidCashOutService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OptionalPendingResult> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzkm IconCompatParcelizer(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrepaidCashOutService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OptionalPendingResult> hmlReviewDocumentActivity3) {
        return new zzkm(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new zzki(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
    }
}
