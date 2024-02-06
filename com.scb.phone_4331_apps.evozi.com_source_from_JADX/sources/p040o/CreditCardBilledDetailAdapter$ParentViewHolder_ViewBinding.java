package p040o;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* renamed from: o.CreditCardBilledDetailAdapter$ParentViewHolder_ViewBinding */
public final class CreditCardBilledDetailAdapter$ParentViewHolder_ViewBinding implements PrivacyManagementLandingViewHolder_ViewBinding {
    private final boolean write;

    public CreditCardBilledDetailAdapter$ParentViewHolder_ViewBinding() {
        this((byte) 0);
    }

    private CreditCardBilledDetailAdapter$ParentViewHolder_ViewBinding(byte b) {
        this.write = false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        if (!(privacyConsentActivity instanceof PrepaidResetPinSuccessActivity_ViewBinding)) {
            return;
        }
        if (privacyConsentActivity.read("Transfer-Encoding")) {
            throw new ProtocolException("Transfer-encoding header already present");
        } else if (!privacyConsentActivity.read("Content-Length")) {
            ReviewAccountsActivity MediaBrowserCompat$CustomActionResultReceiver = privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$CustomActionResultReceiver();
            PrepaidResetOtpActivity IconCompatParcelizer = ((PrepaidResetPinSuccessActivity_ViewBinding) privacyConsentActivity).IconCompatParcelizer();
            if (IconCompatParcelizer == null) {
                privacyConsentActivity.IconCompatParcelizer("Content-Length", "0");
                return;
            }
            if (!IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() && IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver() >= 0) {
                privacyConsentActivity.IconCompatParcelizer("Content-Length", Long.toString(IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()));
            } else if (!MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(ManageAccountInboundActivity.write)) {
                privacyConsentActivity.IconCompatParcelizer("Transfer-Encoding", "chunked");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Chunked transfer encoding not allowed for ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                throw new ProtocolException(sb.toString());
            }
            if (IconCompatParcelizer.read() != null && !privacyConsentActivity.read("Content-Type")) {
                privacyConsentActivity.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read());
            }
            if (IconCompatParcelizer.IconCompatParcelizer() != null && !privacyConsentActivity.read("Content-Encoding")) {
                privacyConsentActivity.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.IconCompatParcelizer());
            }
        } else {
            throw new ProtocolException("Content-Length header already present");
        }
    }
}
