package p040o;

import java.io.IOException;
import org.apache.http.HttpException;

/* renamed from: o.RemittanceOtpActivity */
public final class RemittanceOtpActivity implements PrivacyManagementLandingViewHolder_ViewBinding {
    private final PrepaidTravelCoachMarkActivity_ViewBinding IconCompatParcelizer = PrepaidOtpActivity.write((Class) getClass());

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        if (privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver().equalsIgnoreCase("CONNECT")) {
            privacyConsentActivity.MediaBrowserCompat$ItemReceiver("Proxy-Connection", "Keep-Alive");
            return;
        }
        RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
        Class<GiftOpenSharingMomentActivity_ViewBinding> cls = GiftOpenSharingMomentActivity_ViewBinding.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.route");
        previewButton cast = MediaBrowserCompat$ItemReceiver == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver);
        if (cast == null) {
            this.IconCompatParcelizer.write("Connection route not set in the context");
            return;
        }
        if ((cast.write() == 1 || cast.MediaMetadataCompat()) && !privacyConsentActivity.read("Connection")) {
            privacyConsentActivity.IconCompatParcelizer("Connection", "Keep-Alive");
        }
        if (cast.write() == 2 && !cast.MediaMetadataCompat() && !privacyConsentActivity.read("Proxy-Connection")) {
            privacyConsentActivity.IconCompatParcelizer("Proxy-Connection", "Keep-Alive");
        }
    }
}
