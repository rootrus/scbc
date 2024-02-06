package p040o;

import com.scb.phone.data.network.service.prepaid.cashout.PrepaidCashOutService;

/* renamed from: o.zzky */
public final class zzky implements OPRStatusRewardsLandingActivity_ViewBinding<zzkz> {
    private final HmlReviewDocumentActivity<isDone> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<PrepaidCashOutService> read;

    private zzky(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrepaidCashOutService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<isDone> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static zzky MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrepaidCashOutService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<isDone> hmlReviewDocumentActivity3) {
        return new zzky(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new zzkz(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.IconCompatParcelizer.get());
    }
}
