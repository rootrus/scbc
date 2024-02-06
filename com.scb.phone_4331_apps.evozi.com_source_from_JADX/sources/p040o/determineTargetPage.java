package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.determineTargetPage */
public final class determineTargetPage implements OPRStatusRewardsLandingActivity_ViewBinding<validateIterator> {
    private final HmlReviewDocumentActivity<zzkf> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule write;

    private determineTargetPage(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzkf> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static determineTargetPage write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzkf> hmlReviewDocumentActivity) {
        return new determineTargetPage(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        validateIterator write2 = this.write.write(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
