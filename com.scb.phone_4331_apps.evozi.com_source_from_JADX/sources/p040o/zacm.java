package p040o;

import com.scb.phone.data.network.service.NdidService;
import com.scb.phone.view.activity.ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.zacm */
public final class zacm implements OPRStatusRewardsLandingActivity_ViewBinding<ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver> {
    private final HmlReviewDocumentActivity<NdidService> write;

    private zacm(HmlReviewDocumentActivity<NdidService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zacm read(HmlReviewDocumentActivity<NdidService> hmlReviewDocumentActivity) {
        return new zacm(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver(this.write.get());
    }
}
