package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.fragment.directdebit.C5907x10730e76;

/* renamed from: o.setScaleY */
public final class setScaleY implements OPRStatusRewardsLandingActivity_ViewBinding<ImageField> {
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C5907x10730e76> write;

    private setScaleY(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5907x10730e76> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static setScaleY read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5907x10730e76> hmlReviewDocumentActivity) {
        return new setScaleY(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ImageField MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
