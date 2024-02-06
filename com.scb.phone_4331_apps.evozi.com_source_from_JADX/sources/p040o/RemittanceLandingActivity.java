package p040o;

import java.io.IOException;
import org.apache.http.HttpException;

@Deprecated
/* renamed from: o.RemittanceLandingActivity */
public final class RemittanceLandingActivity extends RemittanceRecipientDetailActivity {
    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        if (!privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver().equalsIgnoreCase("CONNECT") && !privacyConsentActivity.read("Authorization")) {
            ManagePromptpaySuccessActivity managePromptpaySuccessActivity = (ManagePromptpaySuccessActivity) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.auth.target-scope");
            if (managePromptpaySuccessActivity == null) {
                this.IconCompatParcelizer.write("Target auth state not set in the context");
                return;
            }
            if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.IconCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append("Target auth state: ");
                sb.append(managePromptpaySuccessActivity.MediaBrowserCompat$ItemReceiver);
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
            IconCompatParcelizer(managePromptpaySuccessActivity, privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder);
        }
    }
}
