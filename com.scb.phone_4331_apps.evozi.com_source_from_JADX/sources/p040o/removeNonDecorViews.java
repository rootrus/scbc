package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.removeNonDecorViews */
public final class removeNonDecorViews implements OPRStatusRewardsLandingActivity_ViewBinding<getDelegateIterator> {
    private final HmlReviewDocumentActivity<zzke> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;

    private removeNonDecorViews(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzke> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static removeNonDecorViews IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzke> hmlReviewDocumentActivity) {
        return new removeNonDecorViews(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        getDelegateIterator MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
