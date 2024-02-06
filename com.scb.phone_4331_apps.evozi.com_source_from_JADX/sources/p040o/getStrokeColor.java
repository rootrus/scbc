package p040o;

import com.scb.phone.data.network.service.TransferService;
import com.scb.phone.data.p033di.DataModule;
import com.scb.phone.view.activity.hml.BaseHmlLandingActivity;

/* renamed from: o.getStrokeColor */
public final class getStrokeColor implements OPRStatusRewardsLandingActivity_ViewBinding<BaseHmlLandingActivity.write> {
    private final HmlReviewDocumentActivity<TransferService> IconCompatParcelizer;
    private final DataModule write;

    private getStrokeColor(DataModule dataModule, HmlReviewDocumentActivity<TransferService> hmlReviewDocumentActivity) {
        this.write = dataModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getStrokeColor MediaBrowserCompat$CustomActionResultReceiver(DataModule dataModule, HmlReviewDocumentActivity<TransferService> hmlReviewDocumentActivity) {
        return new getStrokeColor(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        BaseHmlLandingActivity.write read = this.write.read(this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
