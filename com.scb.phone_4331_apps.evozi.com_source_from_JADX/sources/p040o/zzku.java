package p040o;

import com.scb.phone.data.network.service.prepaid.PrepaidTravelService;
import p040o.PendingResults;

/* renamed from: o.zzku */
public final class zzku implements OPRStatusRewardsLandingActivity_ViewBinding<zzko> {
    private final HmlReviewDocumentActivity<PendingResults.zab> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<canceledPendingResult> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<PendingResults.zac> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<PrepaidTravelService> read;
    private final HmlReviewDocumentActivity<PendingResults.zaa> write;

    private zzku(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrepaidTravelService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<PendingResults.zac> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<PendingResults.zaa> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<canceledPendingResult> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<PendingResults.zab> hmlReviewDocumentActivity6) {
        this.MediaDescriptionCompat = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.IconCompatParcelizer = hmlReviewDocumentActivity6;
    }

    public static zzku read(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrepaidTravelService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<PendingResults.zac> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<PendingResults.zaa> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<canceledPendingResult> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<PendingResults.zab> hmlReviewDocumentActivity6) {
        return new zzku(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        return new zzko(this.MediaDescriptionCompat.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get());
    }
}
