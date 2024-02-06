package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzov */
public final class zzov implements OPRStatusRewardsLandingActivity_ViewBinding<LabelOptions> {
    private final HmlReviewDocumentActivity<getAncestor> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<refreshIfEmpty> write;

    private zzov(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<refreshIfEmpty> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
    }

    public static zzov MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<refreshIfEmpty> hmlReviewDocumentActivity4) {
        return new zzov(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        LabelOptions MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
