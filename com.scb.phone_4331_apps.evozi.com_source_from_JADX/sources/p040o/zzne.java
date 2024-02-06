package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.Detector;
import p040o.LocalProjectProvider;

/* renamed from: o.zzne */
public final class zzne implements OPRStatusRewardsLandingActivity_ViewBinding<Detector.Detections> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69375> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzne(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3) {
        this.read = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzne MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3) {
        return new zzne(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Detector.Detections MediaBrowserCompat$MediaItem = this.read.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$MediaItem != null) {
            return MediaBrowserCompat$MediaItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
