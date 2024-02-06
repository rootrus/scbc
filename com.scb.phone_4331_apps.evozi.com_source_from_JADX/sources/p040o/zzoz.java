package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzoz */
public final class zzoz implements OPRStatusRewardsLandingActivity_ViewBinding<StreetViewPanoramaLink> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getFrontException> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<C7534ua> read;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> write;

    private zzoz(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7534ua> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity5;
    }

    public static zzoz read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7534ua> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity5) {
        return new zzoz(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        StreetViewPanoramaLink MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat.get(), this.IconCompatParcelizer.get(), this.read.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
