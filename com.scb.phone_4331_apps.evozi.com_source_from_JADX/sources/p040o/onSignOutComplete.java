package p040o;

import com.scb.phone.data.network.service.DeepLinkService;
import p040o.C4771hk;

/* renamed from: o.onSignOutComplete */
public final class onSignOutComplete implements OPRStatusRewardsLandingActivity_ViewBinding<C4771hk.read> {
    private final HmlReviewDocumentActivity<DeepLinkService> MediaBrowserCompat$CustomActionResultReceiver;

    private onSignOutComplete(HmlReviewDocumentActivity<DeepLinkService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static onSignOutComplete MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<DeepLinkService> hmlReviewDocumentActivity) {
        return new onSignOutComplete(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C4771hk.read(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
