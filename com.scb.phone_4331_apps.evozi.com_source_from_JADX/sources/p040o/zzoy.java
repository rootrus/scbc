package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzoy */
public final class zzoy implements OPRStatusRewardsLandingActivity_ViewBinding<setFabCradleRoundedCornerRadius> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<refreshIfEmpty> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getAncestor> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final UseCaseModule write;

    private zzoy(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<refreshIfEmpty> hmlReviewDocumentActivity4) {
        this.write = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
    }

    public static zzoy MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getAncestor> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<refreshIfEmpty> hmlReviewDocumentActivity4) {
        return new zzoy(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        setFabCradleRoundedCornerRadius MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
