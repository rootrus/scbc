package p040o;

import com.scb.phone.data.network.service.TopUpService;
import com.scb.phone.data.p033di.DataModule;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;

/* renamed from: o.getFillAlpha */
public final class getFillAlpha implements OPRStatusRewardsLandingActivity_ViewBinding<FriendsLandingActivity.write> {
    private final DataModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<TopUpService> MediaBrowserCompat$CustomActionResultReceiver;

    private getFillAlpha(DataModule dataModule, HmlReviewDocumentActivity<TopUpService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = dataModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getFillAlpha MediaBrowserCompat$CustomActionResultReceiver(DataModule dataModule, HmlReviewDocumentActivity<TopUpService> hmlReviewDocumentActivity) {
        return new getFillAlpha(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FriendsLandingActivity.write MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
