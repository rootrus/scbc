package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzsq */
public final class zzsq implements OPRStatusRewardsLandingActivity_ViewBinding<defensiveCopy> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<ArrayListMultimap> write;

    private zzsq(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ArrayListMultimap> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzsq MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ArrayListMultimap> hmlReviewDocumentActivity3) {
        return new zzsq(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        defensiveCopy read2 = this.MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer.get(), this.read.get(), this.write.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
