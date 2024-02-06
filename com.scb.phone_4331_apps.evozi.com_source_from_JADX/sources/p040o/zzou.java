package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzou */
public final class zzou implements OPRStatusRewardsLandingActivity_ViewBinding<StreetViewPanoramaLocation> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<C6372x3d677cbb> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzou(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6372x3d677cbb> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzou read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6372x3d677cbb> hmlReviewDocumentActivity3) {
        return new zzou(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        StreetViewPanoramaLocation IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
