package p040o;

import com.scb.phone.data.network.service.easycash.EasycashMCMCService;
import com.scb.phone.data.p033di.easycash.EasycashMCMCDetailRepositoryModule;
import com.scb.phone.view.activity.hml.promptpay.HmlPromptPayVerificationActivity;

/* renamed from: o.pageLeft */
public final class pageLeft implements OPRStatusRewardsLandingActivity_ViewBinding<sortedMap> {
    private final EasycashMCMCDetailRepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CredentialRequestResult> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<EasycashMCMCService> read;
    private final HmlReviewDocumentActivity<HmlPromptPayVerificationActivity.read> write;

    private pageLeft(EasycashMCMCDetailRepositoryModule easycashMCMCDetailRepositoryModule, HmlReviewDocumentActivity<EasycashMCMCService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<HmlPromptPayVerificationActivity.read> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CredentialRequestResult> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4) {
        this.IconCompatParcelizer = easycashMCMCDetailRepositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
    }

    public static pageLeft MediaBrowserCompat$ItemReceiver(EasycashMCMCDetailRepositoryModule easycashMCMCDetailRepositoryModule, HmlReviewDocumentActivity<EasycashMCMCService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<HmlPromptPayVerificationActivity.read> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CredentialRequestResult> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4) {
        return new pageLeft(easycashMCMCDetailRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        sortedMap MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
