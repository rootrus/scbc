package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.detectInImage */
public final class detectInImage implements OPRStatusRewardsLandingActivity_ViewBinding<setBoxBackgroundColorResource> {
    private final HmlReviewDocumentActivity<addToMap> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule write;

    private detectInImage(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<addToMap> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static detectInImage MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<addToMap> hmlReviewDocumentActivity3) {
        return new detectInImage(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setBoxBackgroundColorResource write2 = this.write.write(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
