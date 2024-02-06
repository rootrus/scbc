package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.computeScroll */
public final class computeScroll implements OPRStatusRewardsLandingActivity_ViewBinding<ClassToInstanceMap> {
    private final HmlReviewDocumentActivity<access$208$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;

    private computeScroll(RepositoryModule repositoryModule, HmlReviewDocumentActivity<access$208$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        this.read = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static computeScroll write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<access$208$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        return new computeScroll(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ClassToInstanceMap IconCompatParcelizer = this.read.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
