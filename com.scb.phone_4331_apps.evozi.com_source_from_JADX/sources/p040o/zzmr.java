package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.FaceDetector;
import p040o.LocalProjectProvider;

/* renamed from: o.zzmr */
public final class zzmr implements OPRStatusRewardsLandingActivity_ViewBinding<FaceDetector.Builder> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69353> write;

    private zzmr(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69353> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzmr IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69353> hmlReviewDocumentActivity3) {
        return new zzmr(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        FaceDetector.Builder IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
