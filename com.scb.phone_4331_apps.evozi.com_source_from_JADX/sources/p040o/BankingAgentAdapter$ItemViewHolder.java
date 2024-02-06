package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.BankingAgentAdapter$ItemViewHolder */
public final class BankingAgentAdapter$ItemViewHolder extends MerchantWalletViewPagerAdapter$ItemViewHolder_ViewBinding implements GiftingStatusBaseActivity {
    public final String read() {
        return "max-age";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    thirdPartyConsentFragment.write(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Negative 'max-age' attribute: ");
                sb.append(str);
                throw new MalformedCookieException(sb.toString());
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid 'max-age' attribute: ");
                sb2.append(str);
                throw new MalformedCookieException(sb2.toString());
            }
        } else {
            throw new MalformedCookieException("Missing value for 'max-age' attribute");
        }
    }
}
