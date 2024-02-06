package p040o;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import org.apache.http.client.ClientProtocolException;

/* renamed from: o.TopUpReviewActivity */
public abstract class TopUpReviewActivity implements RegistrationManageDevicesActivity, Closeable {
    /* access modifiers changed from: protected */
    public abstract FriendsRegistrationActivity MediaBrowserCompat$ItemReceiver(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws IOException, ClientProtocolException;

    public TopUpReviewActivity() {
        PrepaidOtpActivity.write((Class) getClass());
    }

    public final /* synthetic */ ScbPrivacyPolicyActivity IconCompatParcelizer(RemittanceCoachmarkActivity_ViewBinding remittanceCoachmarkActivity_ViewBinding) throws IOException, ClientProtocolException {
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(remittanceCoachmarkActivity_ViewBinding, "HTTP request");
        URI MediaDescriptionCompat = remittanceCoachmarkActivity_ViewBinding.MediaDescriptionCompat();
        if (MediaDescriptionCompat.isAbsolute()) {
            privacyManagementLandingViewHolder = RemittanceSenderAddressActivity.read(MediaDescriptionCompat);
            if (privacyManagementLandingViewHolder == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("URI does not specify a valid host name: ");
                sb.append(MediaDescriptionCompat);
                throw new ClientProtocolException(sb.toString());
            }
        } else {
            privacyManagementLandingViewHolder = null;
        }
        return MediaBrowserCompat$ItemReceiver(privacyManagementLandingViewHolder, remittanceCoachmarkActivity_ViewBinding, (CreditCardBilledDetailAdapter$ParentViewHolder) null);
    }
}
