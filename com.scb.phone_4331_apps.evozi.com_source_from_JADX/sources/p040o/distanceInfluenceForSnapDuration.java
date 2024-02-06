package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.distanceInfluenceForSnapDuration */
public final class distanceInfluenceForSnapDuration implements OPRStatusRewardsLandingActivity_ViewBinding<keys> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> read;

    private distanceInfluenceForSnapDuration(RepositoryModule repositoryModule, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = repositoryModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static distanceInfluenceForSnapDuration MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity) {
        return new distanceInfluenceForSnapDuration(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        keys read2 = this.IconCompatParcelizer.read(this.read.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
