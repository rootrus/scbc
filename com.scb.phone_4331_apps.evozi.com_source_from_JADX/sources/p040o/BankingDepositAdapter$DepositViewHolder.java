package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import org.apache.http.cookie.MalformedCookieException;

@Deprecated
/* renamed from: o.BankingDepositAdapter$DepositViewHolder */
public final class BankingDepositAdapter$DepositViewHolder extends MerchantWalletViewPagerAdapter$ItemViewHolder_ViewBinding implements GiftingStatusBaseActivity {
    public final String read() {
        return "version";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (str != null) {
            int i = 0;
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
            thirdPartyConsentFragment.write(i);
            return;
        }
        throw new MalformedCookieException("Missing value for version attribute");
    }
}
