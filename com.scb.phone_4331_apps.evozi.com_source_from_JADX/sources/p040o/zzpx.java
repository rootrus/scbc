package p040o;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AppMeasurement;

/* renamed from: o.zzpx */
public final class zzpx implements OPRStatusRewardsLandingActivity_ViewBinding<AppMeasurement.ConditionalUserProperty> {
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SubsamplingScaleImageView.IconCompatParcelizer> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<findValueIteratorAndKey> MediaBrowserCompat$SearchResultReceiver;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzpx(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<SubsamplingScaleImageView.IconCompatParcelizer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        this.read = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity4;
        this.IconCompatParcelizer = hmlReviewDocumentActivity5;
    }

    public static zzpx IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<SubsamplingScaleImageView.IconCompatParcelizer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        return new zzpx(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        AppMeasurement.ConditionalUserProperty MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
