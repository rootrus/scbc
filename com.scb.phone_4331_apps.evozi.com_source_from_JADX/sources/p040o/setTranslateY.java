package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.LocalProjectProvider;
import p040o.getNotNullImages;

/* renamed from: o.setTranslateY */
public final class setTranslateY implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider.C69331> {
    private final HmlReviewDocumentActivity<getNotNullImages.write> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzs> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindProductCatalogFragment> read;
    private final HmlReviewDocumentActivity<String> write;

    private setTranslateY(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getNotNullImages.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindProductCatalogFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<zzs> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
    }

    public static setTranslateY MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getNotNullImages.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindProductCatalogFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<zzs> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4) {
        return new setTranslateY(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        LocalProjectProvider.C69331 MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
