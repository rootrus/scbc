package p040o;

import com.scb.phone.data.network.service.hml.HmlBusinessOwnerService;
import com.scb.phone.data.network.service.hml.HmlService;

/* renamed from: o.onDataRangeMoved */
public final class onDataRangeMoved implements OPRStatusRewardsLandingActivity_ViewBinding<DataBuffer> {
    private final HmlReviewDocumentActivity<HmlBusinessOwnerService> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<HmlService> write;

    private onDataRangeMoved(HmlReviewDocumentActivity<HmlBusinessOwnerService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<HmlService> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static onDataRangeMoved read(HmlReviewDocumentActivity<HmlBusinessOwnerService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<HmlService> hmlReviewDocumentActivity2) {
        return new onDataRangeMoved(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new DataBuffer(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
    }
}
