package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.setUseNNAPI */
public final class setUseNNAPI implements OPRStatusRewardsLandingActivity_ViewBinding<clearConditionalUserPropertyAs> {
    private final HmlReviewDocumentActivity<C6372x3d677cbb> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private setUseNNAPI(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6372x3d677cbb> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static setUseNNAPI MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6372x3d677cbb> hmlReviewDocumentActivity3) {
        return new setUseNNAPI(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        clearConditionalUserPropertyAs MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
