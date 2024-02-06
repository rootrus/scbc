package p040o;

import java.io.IOException;
import org.apache.http.HttpException;

/* renamed from: o.CreditCardDetailUnbilledAdapter$ChildViewHolder */
public final class CreditCardDetailUnbilledAdapter$ChildViewHolder implements PrivacyManagementLandingViewHolder_ViewBinding {
    private final boolean MediaBrowserCompat$ItemReceiver;

    @Deprecated
    public CreditCardDetailUnbilledAdapter$ChildViewHolder() {
        this((byte) 0);
    }

    private CreditCardDetailUnbilledAdapter$ChildViewHolder(byte b) {
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        if (!privacyConsentActivity.read("Expect") && (privacyConsentActivity instanceof PrepaidResetPinSuccessActivity_ViewBinding)) {
            ReviewAccountsActivity MediaBrowserCompat$CustomActionResultReceiver = privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$CustomActionResultReceiver();
            PrepaidResetOtpActivity IconCompatParcelizer = ((PrepaidResetPinSuccessActivity_ViewBinding) privacyConsentActivity).IconCompatParcelizer();
            if (IconCompatParcelizer != null && IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver() != 0 && !MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(ManageAccountInboundActivity.write) && privacyConsentActivity.write().IconCompatParcelizer("http.protocol.expect-continue", false)) {
                privacyConsentActivity.IconCompatParcelizer("Expect", "100-continue");
            }
        }
    }
}
