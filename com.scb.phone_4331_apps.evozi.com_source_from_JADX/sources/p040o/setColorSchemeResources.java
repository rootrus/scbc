package p040o;

import com.scb.phone.data.network.service.MediaImageService;
import com.scb.phone.data.p033di.DataModule;
import p040o.inject_permissionChecker;

/* renamed from: o.setColorSchemeResources */
public final class setColorSchemeResources implements OPRStatusRewardsLandingActivity_ViewBinding<inject_permissionChecker.IconCompatParcelizer> {
    private final DataModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<MediaImageService> write;

    private setColorSchemeResources(DataModule dataModule, HmlReviewDocumentActivity<MediaImageService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = dataModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static setColorSchemeResources read(DataModule dataModule, HmlReviewDocumentActivity<MediaImageService> hmlReviewDocumentActivity) {
        return new setColorSchemeResources(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        inject_permissionChecker.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
