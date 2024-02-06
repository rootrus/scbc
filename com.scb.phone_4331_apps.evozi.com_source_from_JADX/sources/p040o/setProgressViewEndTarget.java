package p040o;

import android.content.res.AssetManager;
import com.scb.phone.data.network.service.RewardRedemptionService;
import com.scb.phone.data.p033di.DataModule;
import com.scb.phone.view.activity.hml.C5613x13cfb373;

/* renamed from: o.setProgressViewEndTarget */
public final class setProgressViewEndTarget implements OPRStatusRewardsLandingActivity_ViewBinding<C5613x13cfb373> {
    private final HmlReviewDocumentActivity<RewardRedemptionService> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<AssetManager> MediaBrowserCompat$CustomActionResultReceiver;
    private final DataModule write;

    private setProgressViewEndTarget(DataModule dataModule, HmlReviewDocumentActivity<RewardRedemptionService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity2) {
        this.write = dataModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static setProgressViewEndTarget write(DataModule dataModule, HmlReviewDocumentActivity<RewardRedemptionService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity2) {
        return new setProgressViewEndTarget(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        C5613x13cfb373 MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
