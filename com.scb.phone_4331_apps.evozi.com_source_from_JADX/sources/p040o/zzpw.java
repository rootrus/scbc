package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzpw */
public final class zzpw implements OPRStatusRewardsLandingActivity_ViewBinding<alwaysFalse> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<AsynchronousComputationException> write;

    private zzpw(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AsynchronousComputationException> hmlReviewDocumentActivity3) {
        this.read = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzpw MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AsynchronousComputationException> hmlReviewDocumentActivity3) {
        return new zzpw(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        alwaysFalse write2 = this.read.write(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
