package p040o;

import com.scb.phone.data.network.service.privacymanagement.PrivacyManagementService;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.addOnPageChangeListener */
public final class addOnPageChangeListener implements OPRStatusRewardsLandingActivity_ViewBinding<AsynchronousComputationException> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<PrivacyManagementService> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule read;
    private final HmlReviewDocumentActivity<Response> write;

    private addOnPageChangeListener(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrivacyManagementService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Response> hmlReviewDocumentActivity3) {
        this.read = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static addOnPageChangeListener write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrivacyManagementService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Response> hmlReviewDocumentActivity3) {
        return new addOnPageChangeListener(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        AsynchronousComputationException MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
