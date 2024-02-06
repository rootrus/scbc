package p040o;

import java.io.IOException;
import java.util.Collection;
import org.apache.http.HttpException;

/* renamed from: o.RemittanceFaqActivity */
public final class RemittanceFaqActivity implements PrivacyManagementLandingViewHolder_ViewBinding {
    private final Collection<? extends PrepaidRequestMarketConductActivity> MediaBrowserCompat$CustomActionResultReceiver;

    private RemittanceFaqActivity(byte b) {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public RemittanceFaqActivity() {
        this((byte) 0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        if (!privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver().equalsIgnoreCase("CONNECT")) {
            Collection<PrepaidRequestMarketConductActivity> collection = (Collection) privacyConsentActivity.write().IconCompatParcelizer("http.default-headers");
            if (collection == null) {
                collection = null;
            }
            if (collection != null) {
                for (PrepaidRequestMarketConductActivity MediaBrowserCompat$ItemReceiver : collection) {
                    privacyConsentActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver);
                }
            }
        }
    }
}
