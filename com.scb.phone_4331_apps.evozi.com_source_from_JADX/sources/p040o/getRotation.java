package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.fragment.cardmanagement.C5866x109ad279;

/* renamed from: o.getRotation */
public final class getRotation implements OPRStatusRewardsLandingActivity_ViewBinding<IdType> {
    private final HmlReviewDocumentActivity<C5866x109ad279> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule read;

    private getRotation(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5866x109ad279> hmlReviewDocumentActivity) {
        this.read = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getRotation MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5866x109ad279> hmlReviewDocumentActivity) {
        return new getRotation(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        IdType MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
