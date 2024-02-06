package p040o;

import com.scb.phone.data.network.service.privacymanagement.PrivacyManagementService;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.addNewItem */
public final class addNewItem implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractSortedSetMultimap> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<PrivacyManagementService> read;

    private addNewItem(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrivacyManagementService> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
    }

    public static addNewItem read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrivacyManagementService> hmlReviewDocumentActivity2) {
        return new addNewItem(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        AbstractSortedSetMultimap MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get(), this.read.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
