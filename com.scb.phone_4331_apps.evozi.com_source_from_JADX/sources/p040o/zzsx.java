package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import com.scb.phone.domain.repositories.ForgotPinRepositoryContractor;

/* renamed from: o.zzsx */
public final class zzsx implements OPRStatusRewardsLandingActivity_ViewBinding<NativeFaceDetectorV2Impl> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<ForgotPinRepositoryContractor> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzsx(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ForgotPinRepositoryContractor> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static zzsx MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ForgotPinRepositoryContractor> hmlReviewDocumentActivity3) {
        return new zzsx(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        NativeFaceDetectorV2Impl write2 = this.IconCompatParcelizer.write(this.read.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
