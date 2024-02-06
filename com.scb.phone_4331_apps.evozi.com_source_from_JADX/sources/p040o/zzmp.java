package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzmp */
public final class zzmp implements OPRStatusRewardsLandingActivity_ViewBinding<title> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<findValueIteratorAndKey> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<getProjectAsync> write;

    private zzmp(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getProjectAsync> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
    }

    public static zzmp read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getProjectAsync> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<findValueIteratorAndKey> hmlReviewDocumentActivity4) {
        return new zzmp(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        title write2 = this.MediaBrowserCompat$ItemReceiver.write(this.IconCompatParcelizer.get(), this.read.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
