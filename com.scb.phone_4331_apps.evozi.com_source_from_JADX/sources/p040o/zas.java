package p040o;

import com.scb.phone.data.network.service.CardlessATMService;

/* renamed from: o.zas */
public final class zas implements OPRStatusRewardsLandingActivity_ViewBinding<dq$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<CardlessATMService> write;

    private zas(HmlReviewDocumentActivity<CardlessATMService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zas MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<CardlessATMService> hmlReviewDocumentActivity) {
        return new zas(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new dq$MediaBrowserCompat$ItemReceiver(this.write.get());
    }
}
