package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzmi */
public final class zzmi implements OPRStatusRewardsLandingActivity_ViewBinding<memoize> {
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<setCvv> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<newOnDeviceIdExtractor> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzmi(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setCvv> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<newOnDeviceIdExtractor> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
    }

    public static zzmi MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setCvv> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<newOnDeviceIdExtractor> hmlReviewDocumentActivity5) {
        return new zzmi(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        memoize MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat.get(), this.write.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
