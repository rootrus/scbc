package p040o;

import com.scb.phone.data.p033di.prepiad.PrepaidRepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.setInternalPageChangeListener */
public final class setInternalPageChangeListener implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.WrappedSet> {
    private final PrepaidRepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zzkt> MediaBrowserCompat$ItemReceiver;

    private setInternalPageChangeListener(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkt> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidRepositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setInternalPageChangeListener IconCompatParcelizer(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkt> hmlReviewDocumentActivity) {
        return new setInternalPageChangeListener(prepaidRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.WrappedSet MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
