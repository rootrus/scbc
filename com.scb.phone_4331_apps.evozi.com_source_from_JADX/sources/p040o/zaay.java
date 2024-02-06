package p040o;

import com.scb.phone.data.network.service.SecuritiesService;
import p040o.C4299ds;

/* renamed from: o.zaay */
public final class zaay implements OPRStatusRewardsLandingActivity_ViewBinding<C4299ds.write> {
    private final HmlReviewDocumentActivity<SecuritiesService> MediaBrowserCompat$ItemReceiver;

    private zaay(HmlReviewDocumentActivity<SecuritiesService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zaay MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<SecuritiesService> hmlReviewDocumentActivity) {
        return new zaay(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C4299ds.write(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
