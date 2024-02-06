package p040o;

import java.io.IOException;
import org.apache.http.HttpException;

/* renamed from: o.CreditCardDetailUnbilledAdapter$HeaderViewHolder */
public final class CreditCardDetailUnbilledAdapter$HeaderViewHolder implements PrivacyManagementLandingViewHolder_ViewBinding {
    private final String IconCompatParcelizer;

    private CreditCardDetailUnbilledAdapter$HeaderViewHolder(byte b) {
        this.IconCompatParcelizer = null;
    }

    public CreditCardDetailUnbilledAdapter$HeaderViewHolder() {
        this((byte) 0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        if (!privacyConsentActivity.read("User-Agent")) {
            AmountDetailsSuccessAdapter$SuccessRow_ViewBinding write = privacyConsentActivity.write();
            String str = null;
            String str2 = write != null ? (String) write.IconCompatParcelizer("http.useragent") : null;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                privacyConsentActivity.IconCompatParcelizer("User-Agent", str);
            }
        }
    }
}
