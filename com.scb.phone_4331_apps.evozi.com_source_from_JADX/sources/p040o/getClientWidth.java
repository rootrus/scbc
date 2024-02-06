package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.service.SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver;
import p040o.Functions;

/* renamed from: o.getClientWidth */
public final class getClientWidth implements OPRStatusRewardsLandingActivity_ViewBinding<ProjectProviderException> {
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<Functions.IdentityFunction.IconCompatParcelizer> read;

    private getClientWidth(RepositoryModule repositoryModule, HmlReviewDocumentActivity<SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Functions.IdentityFunction.IconCompatParcelizer> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
    }

    public static getClientWidth MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Functions.IdentityFunction.IconCompatParcelizer> hmlReviewDocumentActivity2) {
        return new getClientWidth(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        ProjectProviderException MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
