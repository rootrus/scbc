package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.LargestFaceFocusingProcessor;

/* renamed from: o.zznw */
public final class zznw implements OPRStatusRewardsLandingActivity_ViewBinding<LargestFaceFocusingProcessor.Builder> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zznw(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static zznw read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2) {
        return new zznw(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        LargestFaceFocusingProcessor.Builder MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
