package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.isDecorView */
public final class isDecorView implements OPRStatusRewardsLandingActivity_ViewBinding<inject_extractorProvider> {
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindTopUpBillerSelectedFragment> write;

    private isDecorView(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindTopUpBillerSelectedFragment> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static isDecorView read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindTopUpBillerSelectedFragment> hmlReviewDocumentActivity) {
        return new isDecorView(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        inject_extractorProvider write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write(this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
