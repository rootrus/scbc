package p040o;

import com.scb.phone.data.network.service.ProfileService;
import com.scb.phone.data.network.service.registration.RegistrationWithApiAuthService;
import com.scb.phone.data.p033di.DataModule;
import com.scb.phone.view.activity.deeplink.CreditCardServiceDefaultCardDeepLinkActivity;

/* renamed from: o.setDistanceToTriggerSync */
public final class setDistanceToTriggerSync implements OPRStatusRewardsLandingActivity_ViewBinding<CreditCardServiceDefaultCardDeepLinkActivity.write> {
    private final HmlReviewDocumentActivity<RegistrationWithApiAuthService> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<ProfileService> MediaBrowserCompat$ItemReceiver;
    private final DataModule read;

    private setDistanceToTriggerSync(DataModule dataModule, HmlReviewDocumentActivity<ProfileService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RegistrationWithApiAuthService> hmlReviewDocumentActivity2) {
        this.read = dataModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
    }

    public static setDistanceToTriggerSync write(DataModule dataModule, HmlReviewDocumentActivity<ProfileService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RegistrationWithApiAuthService> hmlReviewDocumentActivity2) {
        return new setDistanceToTriggerSync(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        CreditCardServiceDefaultCardDeepLinkActivity.write MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
