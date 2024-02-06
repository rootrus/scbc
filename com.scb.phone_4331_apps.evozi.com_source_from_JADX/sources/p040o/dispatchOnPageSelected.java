package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.Api;
import p040o.OnDeviceIdExtractor;
import p040o.inject_permissionChecker;

/* renamed from: o.dispatchOnPageSelected */
public final class dispatchOnPageSelected implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor.C6966a.C69671> {
    private final HmlReviewDocumentActivity<inject_permissionChecker.IconCompatParcelizer> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<Api.ApiOptions.NoOptions> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule write;

    private dispatchOnPageSelected(RepositoryModule repositoryModule, HmlReviewDocumentActivity<inject_permissionChecker.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Api.ApiOptions.NoOptions> hmlReviewDocumentActivity2) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static dispatchOnPageSelected read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<inject_permissionChecker.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Api.ApiOptions.NoOptions> hmlReviewDocumentActivity2) {
        return new dispatchOnPageSelected(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        OnDeviceIdExtractor.C6966a.C69671 write2 = this.write.write(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
