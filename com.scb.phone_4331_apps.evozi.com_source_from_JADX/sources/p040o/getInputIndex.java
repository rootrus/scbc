package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.getInputIndex */
public final class getInputIndex implements OPRStatusRewardsLandingActivity_ViewBinding<TileOverlay> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<newOnDeviceIdExtractor> read;
    private final HmlReviewDocumentActivity<OnDeviceIdExtractor_Factory> write;

    private getInputIndex(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<newOnDeviceIdExtractor> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<OnDeviceIdExtractor_Factory> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
    }

    public static getInputIndex MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<newOnDeviceIdExtractor> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<OnDeviceIdExtractor_Factory> hmlReviewDocumentActivity4) {
        return new getInputIndex(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        TileOverlay IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.read.get(), this.write.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
