package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.OnDeviceIdExtractor;

/* renamed from: o.zzqv */
public final class zzqv implements OPRStatusRewardsLandingActivity_ViewBinding<AppMeasurementService> {
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<LocalProjectProvider> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69682> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzqv(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69682> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.MediaMetadataCompat = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.IconCompatParcelizer = hmlReviewDocumentActivity5;
    }

    public static zzqv MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<OnDeviceIdExtractor.C6966a.C69682> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        return new zzqv(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        AppMeasurementService MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.get(), this.write.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
