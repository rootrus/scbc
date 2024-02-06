package p040o;

import com.scb.phone.data.network.api.GoogleSigninApi;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.OnDeviceIdExtractor;

/* renamed from: o.getPageWidth */
public final class getPageWidth implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor.C6966a> {
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseFromTabSelectionFragment> read;
    private final HmlReviewDocumentActivity<GoogleSigninApi> write;

    private getPageWidth(RepositoryModule repositoryModule, HmlReviewDocumentActivity<GoogleSigninApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseFromTabSelectionFragment> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
    }

    public static getPageWidth read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<GoogleSigninApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseFromTabSelectionFragment> hmlReviewDocumentActivity2) {
        return new getPageWidth(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        OnDeviceIdExtractor.C6966a MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
