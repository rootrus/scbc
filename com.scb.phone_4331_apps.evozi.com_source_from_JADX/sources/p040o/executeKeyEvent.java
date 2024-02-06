package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.custom.common.CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.executeKeyEvent */
public final class executeKeyEvent implements OPRStatusRewardsLandingActivity_ViewBinding<PassportCaptureModule_PassportOnDeviceExtractionServer_Factory> {
    private final HmlReviewDocumentActivity<CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver> IconCompatParcelizer;
    private final RepositoryModule write;

    private executeKeyEvent(RepositoryModule repositoryModule, HmlReviewDocumentActivity<CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static executeKeyEvent IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        return new executeKeyEvent(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PassportCaptureModule_PassportOnDeviceExtractionServer_Factory write2 = this.write.write(this.IconCompatParcelizer.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
