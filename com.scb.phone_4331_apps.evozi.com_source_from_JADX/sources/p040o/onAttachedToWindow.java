package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.onAttachedToWindow */
public final class onAttachedToWindow implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.C30091> {
    private final HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule read;

    private onAttachedToWindow(RepositoryModule repositoryModule, HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        this.read = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static onAttachedToWindow MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        return new onAttachedToWindow(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.C30091 MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
