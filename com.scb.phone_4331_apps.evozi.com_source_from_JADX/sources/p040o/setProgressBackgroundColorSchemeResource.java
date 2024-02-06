package p040o;

import com.scb.phone.data.network.service.registration.RegistrationService;
import com.scb.phone.data.network.service.registration.RegistrationWithApiAuthService;
import com.scb.phone.data.p033di.DataModule;
import com.scb.phone.view.activity.partner.PartnerLandingAdapter;

/* renamed from: o.setProgressBackgroundColorSchemeResource */
public final class setProgressBackgroundColorSchemeResource implements OPRStatusRewardsLandingActivity_ViewBinding<PartnerLandingAdapter.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<RegistrationWithApiAuthService> IconCompatParcelizer;
    private final DataModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<RegistrationService> read;

    private setProgressBackgroundColorSchemeResource(DataModule dataModule, HmlReviewDocumentActivity<RegistrationService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RegistrationWithApiAuthService> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dataModule;
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
    }

    public static setProgressBackgroundColorSchemeResource write(DataModule dataModule, HmlReviewDocumentActivity<RegistrationService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RegistrationWithApiAuthService> hmlReviewDocumentActivity2) {
        return new setProgressBackgroundColorSchemeResource(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        PartnerLandingAdapter.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
