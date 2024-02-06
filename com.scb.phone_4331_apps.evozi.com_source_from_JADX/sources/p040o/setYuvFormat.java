package p040o;

import com.scb.phone.data.network.service.FundOnboardingService;
import com.scb.phone.data.p033di.DataModule;
import p040o.getObject;

/* renamed from: o.setYuvFormat */
public final class setYuvFormat implements OPRStatusRewardsLandingActivity_ViewBinding<getObject.read> {
    private final HmlReviewDocumentActivity<FundOnboardingService> MediaBrowserCompat$CustomActionResultReceiver;
    private final DataModule read;

    private setYuvFormat(DataModule dataModule, HmlReviewDocumentActivity<FundOnboardingService> hmlReviewDocumentActivity) {
        this.read = dataModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static setYuvFormat MediaBrowserCompat$ItemReceiver(DataModule dataModule, HmlReviewDocumentActivity<FundOnboardingService> hmlReviewDocumentActivity) {
        return new setYuvFormat(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        getObject.read write = this.read.write(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
