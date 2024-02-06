package p040o;

import java.io.IOException;
import java.net.InetAddress;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* renamed from: o.CreditCardDetailUnbilledAdapter$HeaderViewHolder_ViewBinding */
public final class CreditCardDetailUnbilledAdapter$HeaderViewHolder_ViewBinding implements PrivacyManagementLandingViewHolder_ViewBinding {
    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        CreditCardDetailBilledAdapter$BilledHolder creditCardDetailBilledAdapter$BilledHolder = creditCardBilledDetailAdapter$ParentViewHolder instanceof CreditCardDetailBilledAdapter$BilledHolder ? (CreditCardDetailBilledAdapter$BilledHolder) creditCardBilledDetailAdapter$ParentViewHolder : new CreditCardDetailBilledAdapter$BilledHolder(creditCardBilledDetailAdapter$ParentViewHolder);
        ReviewAccountsActivity MediaBrowserCompat$CustomActionResultReceiver = privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$CustomActionResultReceiver();
        if ((!privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver().equalsIgnoreCase("CONNECT") || !MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(ManageAccountInboundActivity.write)) && !privacyConsentActivity.read("Host")) {
            PrivacyManagementLandingViewHolder write = creditCardDetailBilledAdapter$BilledHolder.write();
            if (write == null) {
                PrepaidRequestReviewActivity IconCompatParcelizer = creditCardDetailBilledAdapter$BilledHolder.IconCompatParcelizer();
                if (IconCompatParcelizer instanceof PrivacyManagementLandingActivity_ViewBinding) {
                    PrivacyManagementLandingActivity_ViewBinding privacyManagementLandingActivity_ViewBinding = (PrivacyManagementLandingActivity_ViewBinding) IconCompatParcelizer;
                    InetAddress MediaBrowserCompat$SearchResultReceiver = privacyManagementLandingActivity_ViewBinding.MediaBrowserCompat$SearchResultReceiver();
                    int MediaDescriptionCompat = privacyManagementLandingActivity_ViewBinding.MediaDescriptionCompat();
                    if (MediaBrowserCompat$SearchResultReceiver != null) {
                        write = new PrivacyManagementLandingViewHolder(MediaBrowserCompat$SearchResultReceiver.getHostName(), MediaDescriptionCompat);
                    }
                }
                if (write == null) {
                    if (!MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(ManageAccountInboundActivity.write)) {
                        throw new ProtocolException("Target host missing");
                    }
                    return;
                }
            }
            privacyConsentActivity.IconCompatParcelizer("Host", write.write());
        }
    }
}
