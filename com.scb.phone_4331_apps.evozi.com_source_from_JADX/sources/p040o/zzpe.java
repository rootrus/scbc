package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.OnDeviceIdExtractor;

/* renamed from: o.zzpe */
public final class zzpe implements OPRStatusRewardsLandingActivity_ViewBinding<TileOverlayOptions> {
    private final HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69671> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzpe(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69671> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
    }

    public static zzpe MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69671> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity4) {
        return new zzpe(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        TileOverlayOptions MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
