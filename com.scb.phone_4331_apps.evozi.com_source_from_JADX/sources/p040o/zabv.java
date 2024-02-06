package p040o;

import com.scb.phone.data.network.service.DirectDebitService;

/* renamed from: o.zabv */
public final class zabv implements OPRStatusRewardsLandingActivity_ViewBinding<ho$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<DirectDebitService> MediaBrowserCompat$ItemReceiver;

    private zabv(HmlReviewDocumentActivity<DirectDebitService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zabv IconCompatParcelizer(HmlReviewDocumentActivity<DirectDebitService> hmlReviewDocumentActivity) {
        return new zabv(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new ho$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
