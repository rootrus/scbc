package p040o;

import com.scb.phone.data.network.service.GiftingService;
import p040o.getProcessName;

/* renamed from: o.zach */
public final class zach implements OPRStatusRewardsLandingActivity_ViewBinding<getProcessName.read> {
    private final HmlReviewDocumentActivity<GiftingService> IconCompatParcelizer;

    private zach(HmlReviewDocumentActivity<GiftingService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static zach MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<GiftingService> hmlReviewDocumentActivity) {
        return new zach(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getProcessName.read(this.IconCompatParcelizer.get());
    }
}
