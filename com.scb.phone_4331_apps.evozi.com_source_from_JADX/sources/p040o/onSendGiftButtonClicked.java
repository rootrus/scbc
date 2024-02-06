package p040o;

import java.security.Principal;
import javax.net.ssl.SSLSession;

/* renamed from: o.onSendGiftButtonClicked */
public final class onSendGiftButtonClicked implements RegistrationOtpActivity {
    private static Principal MediaBrowserCompat$CustomActionResultReceiver(ManagePromptpaySuccessActivity managePromptpaySuccessActivity) {
        PurchaseReviewActivity purchaseReviewActivity;
        ManagePromptpayLandingActivity managePromptpayLandingActivity = managePromptpaySuccessActivity.MediaBrowserCompat$CustomActionResultReceiver;
        if (managePromptpayLandingActivity == null || !managePromptpayLandingActivity.MediaBrowserCompat$CustomActionResultReceiver() || !managePromptpayLandingActivity.MediaBrowserCompat$ItemReceiver() || (purchaseReviewActivity = managePromptpaySuccessActivity.write) == null) {
            return null;
        }
        return purchaseReviewActivity.MediaBrowserCompat$ItemReceiver();
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        Principal principal;
        SSLSession MediaSessionCompat$Token;
        RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
        Class<ManagePromptpaySuccessActivity> cls = ManagePromptpaySuccessActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.auth.target-scope");
        PrepaidRequestReviewActivity prepaidRequestReviewActivity = null;
        ManagePromptpaySuccessActivity cast = MediaBrowserCompat$ItemReceiver == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver);
        if (cast != null) {
            principal = MediaBrowserCompat$CustomActionResultReceiver(cast);
            if (principal == null) {
                Class<ManagePromptpaySuccessActivity> cls2 = ManagePromptpaySuccessActivity.class;
                DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls2, "Attribute class");
                Object MediaBrowserCompat$ItemReceiver2 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.auth.proxy-scope");
                principal = MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2 == null ? null : cls2.cast(MediaBrowserCompat$ItemReceiver2));
            }
        } else {
            principal = null;
        }
        if (principal != null) {
            return principal;
        }
        Class<PrepaidRequestReviewActivity> cls3 = PrepaidRequestReviewActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls3, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver3 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.connection");
        if (MediaBrowserCompat$ItemReceiver3 != null) {
            prepaidRequestReviewActivity = cls3.cast(MediaBrowserCompat$ItemReceiver3);
        }
        PrepaidRequestReviewActivity prepaidRequestReviewActivity2 = prepaidRequestReviewActivity;
        return (!prepaidRequestReviewActivity2.IconCompatParcelizer() || !(prepaidRequestReviewActivity2 instanceof SequentialSearchActivity) || (MediaSessionCompat$Token = ((SequentialSearchActivity) prepaidRequestReviewActivity2).MediaSessionCompat$Token()) == null) ? principal : MediaSessionCompat$Token.getLocalPrincipal();
    }
}
