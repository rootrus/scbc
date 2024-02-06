package p040o;

import com.scb.phone.data.network.service.NTBTileService;
import com.scb.phone.view.activity.FullScreenLoadingActivity;

/* renamed from: o.zack */
public final class zack implements OPRStatusRewardsLandingActivity_ViewBinding<FullScreenLoadingActivity.write> {
    private final HmlReviewDocumentActivity<NTBTileService> read;

    private zack(HmlReviewDocumentActivity<NTBTileService> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static zack read(HmlReviewDocumentActivity<NTBTileService> hmlReviewDocumentActivity) {
        return new zack(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new FullScreenLoadingActivity.write(this.read.get());
    }
}
