package p040o;

import com.scb.phone.data.p033di.prepiad.PrepaidRepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.removeOnPageChangeListener */
public final class removeOnPageChangeListener implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.WrappedCollection.WrappedIterator> {
    private final PrepaidRepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzkp> write;

    private removeOnPageChangeListener(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkp> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = prepaidRepositoryModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static removeOnPageChangeListener IconCompatParcelizer(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkp> hmlReviewDocumentActivity) {
        return new removeOnPageChangeListener(prepaidRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.WrappedCollection.WrappedIterator MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.write.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
