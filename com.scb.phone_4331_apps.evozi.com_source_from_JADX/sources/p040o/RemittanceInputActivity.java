package p040o;

import java.io.IOException;
import org.apache.http.HttpException;
import p040o.previewButton;

@Deprecated
/* renamed from: o.RemittanceInputActivity */
public final class RemittanceInputActivity extends RemittanceRecipientDetailActivity {
    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        if (!privacyConsentActivity.read("Proxy-Authorization")) {
            ScheduleTransactionActivity scheduleTransactionActivity = (ScheduleTransactionActivity) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.connection");
            if (scheduleTransactionActivity == null) {
                this.IconCompatParcelizer.write("HTTP connection not set in the context");
                return;
            }
            if (!(scheduleTransactionActivity.MediaBrowserCompat$MediaItem().IconCompatParcelizer == previewButton.read.TUNNELLED)) {
                ManagePromptpaySuccessActivity managePromptpaySuccessActivity = (ManagePromptpaySuccessActivity) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.auth.proxy-scope");
                if (managePromptpaySuccessActivity == null) {
                    this.IconCompatParcelizer.write("Proxy auth state not set in the context");
                    return;
                }
                if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                    PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.IconCompatParcelizer;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Proxy auth state: ");
                    sb.append(managePromptpaySuccessActivity.MediaBrowserCompat$ItemReceiver);
                    prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
                }
                IconCompatParcelizer(managePromptpaySuccessActivity, privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder);
            }
        }
    }
}
