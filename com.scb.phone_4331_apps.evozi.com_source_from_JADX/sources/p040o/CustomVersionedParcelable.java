package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.IExtractionServer;

/* renamed from: o.CustomVersionedParcelable */
public final class CustomVersionedParcelable implements OPRStatusRewardsLandingActivity_ViewBinding<getVariantAsync> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<IExtractionServer.IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule write;

    private CustomVersionedParcelable(RepositoryModule repositoryModule, HmlReviewDocumentActivity<IExtractionServer.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
    }

    public static CustomVersionedParcelable read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<IExtractionServer.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        return new CustomVersionedParcelable(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        getVariantAsync IconCompatParcelizer2 = this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
