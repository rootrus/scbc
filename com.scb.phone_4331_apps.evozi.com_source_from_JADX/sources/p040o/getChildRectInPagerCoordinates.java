package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.getChildRectInPagerCoordinates */
public final class getChildRectInPagerCoordinates implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor_Factory> {
    private final HmlReviewDocumentActivity<CheckCaptureModule> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<hasApi> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule read;

    private getChildRectInPagerCoordinates(RepositoryModule repositoryModule, HmlReviewDocumentActivity<CheckCaptureModule> hmlReviewDocumentActivity, HmlReviewDocumentActivity<hasApi> hmlReviewDocumentActivity2) {
        this.read = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static getChildRectInPagerCoordinates MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<CheckCaptureModule> hmlReviewDocumentActivity, HmlReviewDocumentActivity<hasApi> hmlReviewDocumentActivity2) {
        return new getChildRectInPagerCoordinates(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        OnDeviceIdExtractor_Factory write = this.read.write(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
