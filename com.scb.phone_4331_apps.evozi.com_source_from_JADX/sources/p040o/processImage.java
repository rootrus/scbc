package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.processImage */
public final class processImage implements OPRStatusRewardsLandingActivity_ViewBinding<InstallException> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C6897xeb950f47> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule write;

    private processImage(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6897xeb950f47> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static processImage MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6897xeb950f47> hmlReviewDocumentActivity3) {
        return new processImage(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        InstallException MediaBrowserCompat$MediaItem = this.write.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$MediaItem != null) {
            return MediaBrowserCompat$MediaItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
