package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.setLenient */
public final class setLenient implements OPRStatusRewardsLandingActivity_ViewBinding<AppMeasurementInstallReferrerReceiver> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<C7515tZ> read;
    private final HmlReviewDocumentActivity<classificationConfidence> write;

    private setLenient(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7515tZ> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<classificationConfidence> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        this.IconCompatParcelizer = useCaseModule;
        this.MediaMetadataCompat = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
    }

    public static setLenient MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7515tZ> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<classificationConfidence> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        return new setLenient(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        AppMeasurementInstallReferrerReceiver MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
