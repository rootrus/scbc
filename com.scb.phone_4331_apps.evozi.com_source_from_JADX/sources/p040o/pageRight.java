package p040o;

import com.scb.phone.data.p033di.prepiad.PrepaidRepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.pageRight */
public final class pageRight implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.WrappedSortedSet> {
    private final HmlReviewDocumentActivity<zzko> IconCompatParcelizer;
    private final PrepaidRepositoryModule MediaBrowserCompat$ItemReceiver;

    private pageRight(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzko> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = prepaidRepositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static pageRight MediaBrowserCompat$ItemReceiver(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzko> hmlReviewDocumentActivity) {
        return new pageRight(prepaidRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.WrappedSortedSet MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
