package p040o;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.deeplink.C5584x1d866acf;
import p040o.BackgroundDetector;

/* renamed from: o.beginFakeDrag */
public final class beginFakeDrag implements OPRStatusRewardsLandingActivity_ViewBinding<SubsamplingScaleImageView.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<BackgroundDetector.BackgroundStateChangeListener> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C5584x1d866acf> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindRequestToPayLandingFragment> read;
    private final RepositoryModule write;

    private beginFakeDrag(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5584x1d866acf> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindRequestToPayLandingFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<BackgroundDetector.BackgroundStateChangeListener> hmlReviewDocumentActivity3) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static beginFakeDrag MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5584x1d866acf> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindRequestToPayLandingFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<BackgroundDetector.BackgroundStateChangeListener> hmlReviewDocumentActivity3) {
        return new beginFakeDrag(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        SubsamplingScaleImageView.IconCompatParcelizer read2 = this.write.read(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
