package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.setTrimPathOffset */
public final class setTrimPathOffset implements OPRStatusRewardsLandingActivity_ViewBinding<IIdExtractor> {
    private final HmlReviewDocumentActivity<zaaw> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<onActivityResumed> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<getKernelIDSrc> read;
    private final RepositoryModule write;

    private setTrimPathOffset(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zaaw> hmlReviewDocumentActivity, HmlReviewDocumentActivity<onActivityResumed> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getKernelIDSrc> hmlReviewDocumentActivity3) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static setTrimPathOffset IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zaaw> hmlReviewDocumentActivity, HmlReviewDocumentActivity<onActivityResumed> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getKernelIDSrc> hmlReviewDocumentActivity3) {
        return new setTrimPathOffset(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        IIdExtractor MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
