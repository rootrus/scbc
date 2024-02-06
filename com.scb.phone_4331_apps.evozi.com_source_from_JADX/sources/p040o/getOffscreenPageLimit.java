package p040o;

import com.scb.phone.data.network.service.privacymanagement.PrivacyManagementService;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.getOffscreenPageLimit */
public final class getOffscreenPageLimit implements OPRStatusRewardsLandingActivity_ViewBinding<ArrayListMultimap> {
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<PrivacyManagementService> read;
    private final RepositoryModule write;

    private getOffscreenPageLimit(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrivacyManagementService> hmlReviewDocumentActivity2) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
    }

    public static getOffscreenPageLimit write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrivacyManagementService> hmlReviewDocumentActivity2) {
        return new getOffscreenPageLimit(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        ArrayListMultimap IconCompatParcelizer = this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
