package p040o;

import com.scb.phone.data.network.api.mailingaddress.MailingAddressApi;
import com.scb.phone.data.network.service.mailingaddress.MailingAddressService;

/* renamed from: o.DataBufferSafeParcelable */
public final class DataBufferSafeParcelable implements OPRStatusRewardsLandingActivity_ViewBinding<MailingAddressApi> {
    private final HmlReviewDocumentActivity<MailingAddressService> MediaBrowserCompat$CustomActionResultReceiver;

    private DataBufferSafeParcelable(HmlReviewDocumentActivity<MailingAddressService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static DataBufferSafeParcelable MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<MailingAddressService> hmlReviewDocumentActivity) {
        return new DataBufferSafeParcelable(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new MailingAddressApi(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
