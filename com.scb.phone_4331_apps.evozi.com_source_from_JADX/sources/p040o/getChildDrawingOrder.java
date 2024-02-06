package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.getChildDrawingOrder */
public final class getChildDrawingOrder implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.Entries> {
    private final HmlReviewDocumentActivity<setRootView$MediaBrowserCompat$ItemReceiver> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;

    private getChildDrawingOrder(RepositoryModule repositoryModule, HmlReviewDocumentActivity<setRootView$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getChildDrawingOrder write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<setRootView$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        return new getChildDrawingOrder(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.Entries MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
