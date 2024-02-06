package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzmv */
public final class zzmv implements OPRStatusRewardsLandingActivity_ViewBinding<getIsSmilingProbability> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<ServerProjectProvider> read;
    private final UseCaseModule write;

    private zzmv(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzmv MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider> hmlReviewDocumentActivity3) {
        return new zzmv(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        getIsSmilingProbability MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
