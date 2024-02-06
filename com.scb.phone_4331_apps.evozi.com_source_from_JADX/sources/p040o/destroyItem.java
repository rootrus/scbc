package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.CredentialsOptions;
import p040o.LocalProjectProvider;

/* renamed from: o.destroyItem */
public final class destroyItem implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider.VersionTable.VersionList> {
    private final HmlReviewDocumentActivity<C4494xdf0bba7d> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CredentialsOptions.Builder> write;

    private destroyItem(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4494xdf0bba7d> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CredentialsOptions.Builder> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static destroyItem write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4494xdf0bba7d> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CredentialsOptions.Builder> hmlReviewDocumentActivity2) {
        return new destroyItem(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        LocalProjectProvider.VersionTable.VersionList MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
