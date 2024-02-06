package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zznu */
public final class zznu implements OPRStatusRewardsLandingActivity_ViewBinding<getUnknownKeys> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C7514tY> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zznu(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zznu read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3) {
        return new zznu(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        getUnknownKeys read = this.MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
