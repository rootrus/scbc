package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.clearOnPageChangeListeners */
public final class clearOnPageChangeListeners implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultiset> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzlu> MediaBrowserCompat$ItemReceiver;

    private clearOnPageChangeListeners(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzlu> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static clearOnPageChangeListeners IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzlu> hmlReviewDocumentActivity) {
        return new clearOnPageChangeListeners(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultiset MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
