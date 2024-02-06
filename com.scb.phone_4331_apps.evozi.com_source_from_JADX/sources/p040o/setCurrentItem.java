package p040o;

import com.scb.phone.data.p033di.prepiad.PrepaidRepositoryModule;

/* renamed from: o.setCurrentItem */
public final class setCurrentItem implements OPRStatusRewardsLandingActivity_ViewBinding<getSortedSetDelegate> {
    private final HmlReviewDocumentActivity<zzkv> MediaBrowserCompat$ItemReceiver;
    private final PrepaidRepositoryModule read;

    private setCurrentItem(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkv> hmlReviewDocumentActivity) {
        this.read = prepaidRepositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setCurrentItem write(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkv> hmlReviewDocumentActivity) {
        return new setCurrentItem(prepaidRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        getSortedSetDelegate MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
