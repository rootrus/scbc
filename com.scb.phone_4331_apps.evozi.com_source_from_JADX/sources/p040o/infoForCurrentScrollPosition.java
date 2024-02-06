package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.OnDeviceIdExtractor;

/* renamed from: o.infoForCurrentScrollPosition */
public final class infoForCurrentScrollPosition implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor.C6966a.C69693> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindECouponQuantityFragment> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;

    private infoForCurrentScrollPosition(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindECouponQuantityFragment> hmlReviewDocumentActivity) {
        this.read = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static infoForCurrentScrollPosition write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindECouponQuantityFragment> hmlReviewDocumentActivity) {
        return new infoForCurrentScrollPosition(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        OnDeviceIdExtractor.C6966a.C69693 MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
